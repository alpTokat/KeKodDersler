package function

fun main() {

    print("birinci sayiyi giriniz: ")
    val numberOne = readLine()!!.toInt()
    print("\nikinci sayiyi giriniz: ")
    val numberTwo = readLine()!!.toInt()

    print("\nİşlem türünü giriniz: ")
    val operation: String = readLine()!!

    val sumFunction = {numberOne:Int,numberTwo:Int->
        numberOne+numberTwo
    }

    val minusFunction = fun(numberOne:Int, numberTwo:Int):Int{
        return numberOne - numberTwo
    }

    val multiplyFunction = fun(numberOne:Int, numberTwo:Int):Int = numberOne * numberTwo


    when (operation) {
        "+" -> calculateAndPrint(numberOne,numberTwo,{numberOne, numberTwo -> numberOne+numberTwo })
        "+" -> calculateAndPrint(numberOne,numberTwo,sumFunction) // 1. higher order tanimlama

        "-" -> calculateAndPrint(numberOne,numberTwo,{numberOne, numberTwo -> numberOne-numberTwo})
        "-" -> calculateAndPrint(numberOne,numberTwo,minusFunction)//2. higher order tanimlama

        "*" -> calculateAndPrint(numberOne,numberTwo,{numberOne, numberTwo -> numberOne*numberTwo})
        "*" -> calculateAndPrint(numberOne,numberTwo,multiplyFunction)

        "/"-> calculateAndPrint(numberOne,numberTwo,{numberOne, numberTwo -> numberOne/numberTwo})
        "/"-> calculateAndPrint(numberOne,numberTwo,::divFunction) // normal bir fonksiyon seklinde higher order tanimlamak istiyorsak parametre geri donus hersey ayni olmali.
        "/"-> calculateAndPrint(numberOne,numberTwo,::divFunction2) // en guzel yontem
     }
}
fun divFunction(numberOne: Int,numberTwo: Int):Int{
    return numberOne / numberTwo
}
fun divFunction2(numberOne: Int,numberTwo: Int):Int{
    return numberOne / numberTwo
}

fun calculateAndPrint(numberOne:Int, numberTwo:Int, operation:(numberOne:Int, numberTwo:Int)->Int){
    val result = operation(numberOne,numberTwo)
    println("result: $result")
}

fun calculateAndPrint2(numberOne:Int, numberTwo:Int, operation:(Int, Int)->Int){ // higher order functionlarda parametrelere isim vermeye gerek yok
    val result = operation(numberOne,numberTwo)
    println("result: $result")
}

//parametreler default degerler verebiliyorsak higher order'a da vereceiliriz.

fun calculateAndPrint3(numberOne:Int, numberTwo:Int, operation:(Int, Int)->Int={numberOne,NumberTwo-> numberOne+numberTwo}){ // higher order functionlarda parametrelere isim vermeye gerek yok
    val result = operation(numberOne,numberTwo)
    println("result: $result")
}

fun calculateAndPrint4(numberOne:Int, numberTwo:Int, operation:(Int, Int)->Int=::defaultSum){ // higher order functionlarda parametrelere isim vermeye gerek yok
    val result = operation(numberOne,numberTwo)
    println("result: $result")
}
fun defaultSum(numberOne: Int, numberTwo: Int):Int {
    return numberOne + numberTwo
}