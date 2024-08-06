package controlflow

fun main() {
    var numberOne = 10
    var numberTwo = 5

    println(numberOne)
    println(numberOne++)
    println(numberOne)
    println(++numberOne)

    print("${numberOne + numberTwo}")
    print(" = ")
    println(numberOne.plus(numberTwo))

    print(numberOne - numberTwo)
    print(" = ")
    println(numberOne.minus(numberTwo))

    print(numberOne * numberTwo)
    print(" = ")
    println(numberOne.times(numberTwo))

    print(numberOne / numberTwo)
    print(" = ")
    println(numberOne.div(numberTwo))

    print(numberOne % numberTwo)
    print(" = ")
    println(numberOne.rem(numberTwo))

    println("------------------------------------------------------------------")

    print("Please enter a final note: ")
    val grade = readLine()!!.toInt()

    val charNote = if (grade == 100) {
            "$grade = AA"
        }
        else if(grade <=99 && grade >= 80) {
            "$grade = BB"
        }
        else if(grade <= 79 && grade >=50) {
            "$grade = CC"
        }
        else if(grade <= 49 && grade >= 20) {
            "$grade = DD"
        }else if(grade >=20 && grade <=0) {
            "$grade = FF"
        }else{
            "$grade = bulunamadı"
        }
        println(charNote)

    println("----------------------------------------------------------------------------------")

    println(grade.compareTo(100) == -1) // grade < 100
    println(grade.compareTo(100) == 1)  // grade = 100
    println(grade.compareTo(100) >= 0)  // grade >= 100
    println(grade.equals(100))  // grade = 100
    println(grade.equals(100))  // grade = 100
    println(!grade.equals(100)) // grade != 100

    println("----------------------------------------------------------------------------------")

    var a = 20
    var b = 5
    a += b // a = a + b
    println("a+=b : " +a)
    a-=b // a = a - b
    println("a-=b : " +a)
    a*=b
    println("a*=b : " +a)
    a/=b
    println("a/=b : " +a)
    a%=b
    println("a%=b : " +a)

    /*
        a+=b    a.plusAssign(b)
        a-=b    a.minusAssign(b)
        a*=b    a.timesAssign(b)
        a/=b    a.divAssign(b)
        a%=b    a.remAssign(b)
     */


    println("----------------------------------------------------------------")

    var numOne = 10
    var numTwo = 5
    var flag = true
    println("+a :"+ +numOne)
    println("-a :"+ -numTwo)
    println("++a :"+ ++numOne)
    println("a++ :" + numOne++)
    println("a :" +numOne)
    println("--b :"+ --numberTwo)
    println("!flag : " + !flag)
    println("!flag :" + flag.not())

    /*
            +a      a.unaryPlus()
            -a      a.unaryMinus()
            ++a     a.inc() a = a + 1
            --a     a.dec() a = a - 1
            !a      a.not()
     */

    println("----------------------------------------------------------------")

    /**
     *      === ifadesi isaret edilen referans tipleri kiyaslar
     *      == ifadesi degeri karsilastirir.
     */






}