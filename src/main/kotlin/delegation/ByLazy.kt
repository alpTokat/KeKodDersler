package delegation

import kotlin.concurrent.thread

/**
 * Degerlendirme(Evaluation): by lazy ile tanımlanan bir degisken, ilk erişildiğinde degerlendirilir.
 * ve değeri hesaplanır. Sonraki erişimlerde ise hesaplanan değer doğrudan döndürülür.
 * Bu, özellikle hesaplanması maliyetli veya zaman alan işlemler için performans avantajı sağlar.
 *
 * Null safety: bu lazy ile tanımlanan değişkenler null olmaz(none-nullable)
 * Bu, güvenli bir sekilde kullanılabileceklerini garanti eder. lateinit ile tanımlanan null olabilir(nullable)
 *
 * Thread safety: by lazy varsayılan olarak thread-sade'dir. Yani, aynı değiskene birden fazla thread aynı anda eriştiğinde, doğru değer
 * güvenli bir sekilde döndürülür.
 *
 * Kullanım durum: Genellikle, hesaplaması maliyetli olan, ancak her zaman kullanılamayabilecek degerler için tercih edilir.
 * Örneğin, bir konfigürasyon dosyasını okumak veya bir ağ isteği yapmak gibi işlemler için idealdir.
 *
 */


class Foo{
    init {
        println("Object İnitialized")
    }
}

fun demo(){

    val lazyObj: Foo by lazy{
        println("Lazy object initialized")
        Foo()
    }




    println("First access:")
    println(lazyObj)

    println("Second access:")
    println(lazyObj)
}


/**
 * SYNCHRONIZED: lazy değerine ilk erişimde tüm thread'leri bloklar ve value alanının oluşturulmasını tek bir thread'le sınırlar.
 * Default yöntem budur.
 *
 * PUBLİCATION: value alanının oluşturulmasında tek bir thread'e sınırlama getirmez.
 * Birden fazla thread, value alanını aynı anda olusturabilir, ancak oluşturma işlemi tamamladıktan sonra
 * sadece bir thread'e value alanına erişim izni verilir. Diğer thread'ler oluşturma işlemi tamamlanana kadar bekler.
 *
 * NONE: thread güvenliği sağlamaz. Birden fazla thread, aynı anda value alanını oluşturabilir ve bu olusturma işlemi
 * sırasında herhangi bir senkronizasyon yapılmaz. Bu nedenle, bu mod, yalnızca tek thread'in erişimine uygun olan
 * durumlarda kullanılmalıdır.
 */


class LazySynchronizedExample{
    var count = 0
    val lazyValue:Int by lazy(LazyThreadSafetyMode.SYNCHRONIZED){
        println("Lazy value is being computed")
        Thread.sleep(2000)
        ++count
    }
}

class LazyPublicationExample{
    var count = 0
    val lazyValue:Int by lazy(LazyThreadSafetyMode.PUBLICATION){
        println("Lazy value is being computed")
        Thread.sleep(2000)
        ++count
    }
}


fun main() {
//    demo()

    val exampleSynchronized = LazySynchronizedExample()
    val examplePublication = LazyPublicationExample()
    //Thread Publication ile yapılan örnek
    val thread1 = thread{println("Thread 1:${examplePublication.lazyValue}")}
    val thread2 = thread{println("Thread 2:${examplePublication.lazyValue}")}

    //Thread Synchronized ile yapılan örnek
    val thread3 = thread{println("Thread 3:${exampleSynchronized.lazyValue}")}
    val thread4 = thread{println("Thread 4:${exampleSynchronized.lazyValue}")}

    //Threadlerin tamamlanmasını bekler
    thread1.join()
    thread2.join()
    thread3.join()
    thread4.join()
}