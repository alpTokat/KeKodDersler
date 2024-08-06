package controlflow

data class PairNumber(val numberOne:Int, val numberTwo:Int){
    operator fun minus(pairNumber: PairNumber): PairNumber {
        val localNumberOne = numberOne - pairNumber.numberOne
        val localNumberTwo = numberTwo - pairNumber.numberTwo
        val returnPairNumber = PairNumber(localNumberOne,localNumberTwo)

        println("Sonuc = ${returnPairNumber.numberOne}, ${returnPairNumber.numberTwo} ")
        return returnPairNumber
    }
}


fun main() {

    val a:Int = 5
    val b = 8

    var result = a + b
    result = a.plus(b)

    val pairNumber = PairNumber(2,4)
    val pairNumber2 = PairNumber(-8,11)

    val resultOne = pairNumber.numberOne - pairNumber2.numberOne // burdakiler birer sayi degeri
    val resultTwo = pairNumber.numberTwo - pairNumber2.numberTwo // ust tarafta tanimladigim minus fonksiyonuna gitmez.
    println("Sonuc = (${resultOne}, ${resultTwo})")

   // pairNumber + pairNumber2 // hata verecektir. Çünkü plus operatoru sınıf parametresi almiyor.
//    pairNumber.plus(pairNumber2) //ayni sekilde hata alicaktir.

    pairNumber - pairNumber2 // hata vermez yukardaki minus operatorunu overload yaptik.
    pairNumber.minus(pairNumber2) // yine hata vermeyecektir.

}