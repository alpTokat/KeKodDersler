package scopefun

fun main() {
    val name:String? = "null"

    //T = Önüne gelen değişken , R ise son satır
    val returnValueLet = name?.let {
        println("let $it")
        2
    }

    println(returnValueLet)


    //  T = Önüne gelen değişken
    //  R = son satır
    //  Lambda param = yok, this = T
    var returnValueRun = name?.run {
        println("run")
    }

    println(returnValueRun)

    // T =yok, extension islemi yok
    // R = son satır
    //Lambda param = yok, this = yok, çünkü extension yok
    returnValueRun = run {
        println("run")
    }
    println(returnValueRun)

    // T =fonksiyonun, fonksiyon olmayan, değişken olan parametresi - yani 1.parametre, extension işlemi yok
    // R = son satır, geri dönüş değeri
    // Lambda param = yok, (this= yok, çünkü extension yok)

    val returnValueWith = with(name){
        println("with $this")
    }
    // T = Önüne gelen değişken
    // R = yok, çünkü higher order function'ın geri donus değeri yok. Onun yerine T geri döndürülüyor
    // Lambda param = yok, (this= T, çünkü extension function) -> name geri donus degeri
    name?.apply {
        println("apply")
    }
    //
    //    // T = Önüne gelen değişken
    //    // R = yok, çünkü higher order function'ın geri donus değeri yok. Onun yerine T geri döndürülüyor
    //      // Lambda param = T, (this= yok, çünkü extension function yok) -> name geri donus degeri

    name?.also {
        println("also $it")
    }

    name?.takeIf {
        true
    }
}