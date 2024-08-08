package loop

fun main() {


    //1 den 10 a kadar sayilar dongu
    for(value in 1..10) {
        print(value)

    }
    println()
    // alphabet list for loop
    for (letter in 'A'..'Z') {
        print(letter)
    }
    println()

    //country code = "az","er" dongu seklinde
    val countryCode = arrayOf("az","er","tr","ru")
    for (value in countryCode) {
        println(value)
    }


    // country code indekslerine göre döndürme
    for(index in countryCode.indices){
        println("${index}. value is ${countryCode[index]}")
    }

    // country code index and value together get in for loop // Destructuring Declartions
    for ((index,value) in countryCode.withIndex()){
        println("${index}. value is ${value}")
    }
    //repeat döngü anla
    repeat(10){
        print("\nDaha fazla makale yazmam lazım.")
    }

    println("-------------------------------------------")
    // return ve continue örnek yaz. Cift degerleri continue ile yazdırma
    for (value in 1..50){
        if (value % 2 ==1){
            continue
        }
        print("$value, ")
    }

    for (value in 1..50){
        if (value % 2 ==1){
            //return //main fonksiyonun dışına çıkar
        }
       // print("$value, ")
    }


    // normal continue li bir ic ice bir for dongusu
    for (value in 1..10){
        for (value2 in 1..50){
            if (value2%2 ==1){
                continue
            }
            print("$value2, ")
        }
        println()
    }

    //label ile kullanilan bir ic ice dongu continue ile label a gitme
    returnlabel@for (value in 1..10){
        for (value2 in 1..10){
            if (value2%2 ==1){
                println("$value , $value2")
                continue@returnlabel
            }
        }
    }

    //normal breakli ic ice for dongüsü
    for (value in 1..10){
        for (value2 in 1..10){
            if (value2%2 ==0){
                break
            }
        }
    }

    // aynı sekilde break ile yazılısıda
    returnLabel@for (value in 1..10){
        for (value2 in 1..10){
            if (value2%2 ==0){
                break@returnLabel
            }
        }
    }
}