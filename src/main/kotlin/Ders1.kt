fun main() {
    //    println("Hello World")
    //
    //    for (lang in args) {
    //        println(lang)
    //    }

    // val keywordü ile değişken tanımlama
    val name: String = "Alp Tokat"
    val age = 23
    val surname: String // değişkeni tanımlama

    surname = readLine()!! // yukarda tanımladığım değişkene değer atama

    println("$name $age $surname") // değerleri ekranda yazdırma

    // var keyword'ü ile değişken tanımlama
    var school = "Gaziosmanpaşa University"
    var number: Int = 7

    println("$school $number")

    //Var ile Val arasındaki fark:
    // val keyword'u değişkene değer verildikten sonra bir daha değiştirilemeyen değişkenler için kullanılır.
    // var keyword'u değişkene değer verildikten sonra bir daha değişebilen değişkenler için kullanılır.

    //    name = "Yiğit" -> Val cannot be reassigned hatası verir.
    number = 9 // hata vermez
}