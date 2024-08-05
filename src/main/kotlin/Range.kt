fun main() {
    /**
     *  Sonlu sayili liste olusturmamizi saglar.
     */

    /**
     *  kucukten buyuge liste olusturmak icin;
     *  ".." operatoru ya da "rangeTo()"
     *  "..<" operatoru ya da "rangeUntil"
     *  fonksiyonlari kullanilabilir.
     */

    val numbers = 1..100 //[1,100] -> 1,2,3,4,5,---------------,98,99,100
    val numbers2 = 1.rangeTo(100)// yukardaki ile ayni
//    val numbers3 = 1 rangeTo 100 hata verir.

    val numbersUntil = 1..<100 //[1,100)
    val numbersUntil2 =1.rangeUntil(100) // yukardaki ile ayni
//    val numbersUntil3 = 1 rangeUntil 100 infix olarak degistirilmesi lazim.


    /**
     *  Char tipindeki sirali bir listede olusturmak mumkun
     */
    val alphabet = 'a'..'z'


    /**
     *      Buyukten kucuge ".." ile tanimlayamayiz.
     *      Buyukten kucuge tanimlamak istiyorsak downTo() fonksiyonunu kullanmamiz gerekiyor.
     *      İnfix kullanimide var.
     */

    val numbersHighToLow = 100.downTo(1)
    val numbersHighToLow2 = 100 downTo 1
    print("High to lower numbers:")
    numbersHighToLow2.forEach { println(it) }

    /**
     *      until kullanarakta range tanimlanabilir. ancak until arasinda demek oldugu icin
     *      bitis degeri listeye dahil edilmez.
     */
    val gradeNumbers = 10.until(100) // [10,100)
    val gradeNumbers2 = 10.rangeTo(99) // [10,100)
    val gradeNumbers3 = 10..99


    /**
     *      step fonksiyonu kullanilarak bir siralamaya gore liste olustururken adim aatlama sayisini gosterecektir.
     */

    val stepNumbers = 1..100 step (2)
    val stepNumbers2 = 1..100 step 3
    print("stepedNumbers: ")
    stepNumbers2.forEach { println(it) }

    val reservedStepNumbers = 100.downTo(1) step (3)
    val reservedStepNumbers2 = 100 downTo 1 step 2
    print("reservedNumbers: ")
    reservedStepNumbers2.forEach { println(it) }


    /**
     *      CharRange, IntRange ve LongRange isimlerinde özel range türleri vardir. Progression olarak adlandirilir.
     *      diger tipler bulunmaz.
     *      Bu durumda, first, last,step, count gibi ek bilgilere ulasilabilir.
     *      Itarable<N> interface'ini implement etmişlerdir. O sebeple map filter gibi fonksiyonlar kullanilabilir.
     */

    val numberList:IntRange = 1..<100
    numberList.first
    numberList.last // last bilgisi donulurken step'e gore donus saglanabilir.
    numberList.step

    when(10){
        in numberList ->{
            println("10 sayisi numberList icerisinde yer alir.")
        }
    }

    numberList.count()

    val countBiggerThan50 = numberList.count{it > 50}

    println(countBiggerThan50)

    println("numberList.average ${numberList.average()}")
    println("numberList.reserved ${numberList.reversed()}")

}