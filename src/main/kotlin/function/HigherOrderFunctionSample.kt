package function

fun main() {
    calculateAndPrintNormal(2,10,'+')
    calculateAndPrintNormal(100,50,'-')
    calculateAndPrintNormal(10,20,'*')
    calculateAndPrintNormal(10,20,'/')



    calculateAndPrintHigherOrder(20,10,{numberOne, numberTwo -> numberOne-numberTwo })
    calculateAndPrintHigherOrder(20,10,{numberOne, numberTwo -> numberOne*numberTwo })
    calculateAndPrintHigherOrder(20,10,{numberOne, numberTwo -> numberOne/numberTwo })
    calculateAndPrintHigherOrder(
        10,
        20,{
            numberOne, numberTwo ->
            numberOne + numberTwo
        }
    )
}






fun calculateAndPrintHigherOrder(numberOne:Int, numberTwo:Int, operation:(numberOne:Int, numberTwo:Int)->Int) {
    val result = operation(numberOne,numberTwo)
    println("result : $result")
}



fun calculateAndPrintNormal(numberOne:Int, numberTwo:Int,operation:Char){ //normal bir if state'li funcion
    val result = when (operation) { //expression kullanimi
        '+' -> {
            numberOne + numberTwo
        }
        '-' -> {
            numberOne - numberTwo
        }
        '*' -> {
            numberOne * numberTwo
        }
        '/' -> {
            numberOne / numberTwo
        }
        else -> {
            numberOne + numberTwo
        }
    }
    println("Result: $result")
}