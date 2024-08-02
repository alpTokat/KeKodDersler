fun main() {
    /**
     *      char değişkenler 16 bit yer kaplar.
     *
     *      char değerler, iki tırnak arasında harf, rakam, unicode,
     *      Çift tirnak icerisinde yazılırsa char degil string olur.
     */

    val firstCharOfName:Char = 'A'
    // val firstCharOfName:Char = "A"   hatali
    //val firstCharOfName:Char = 'AL', hatali
    val charNumber:Char = '4'
    //val charNumber:Char = '58'  hatali


    //------------------------------------------------------------------------------------------------------------

    /**
     *      number degerler char olarak tanımlandıklarında eger ki conversion yapılırsa
     *      o rakamın ASCII tablosunda karşılık gelen decimal değer doner.
     */

    val convertedNumber = charNumber.toInt()
    val convertedNumber2 = charNumber.code
    println(convertedNumber)
    println(convertedNumber2)
    //normal degerine dondormek istiyorsak ozel bir fonksiyon olan digitToInt() kullanılır.
    val intNumber = charNumber.digitToInt()
    println(intNumber) //output: 4

    //-----------------------------------------------------------------------------------------------------

    /**
     *      Kacis(Escape) karakterlerini de tanimlamak icin kullanilir.
     */

    val exampleString = "Kotlinde Escape karakter örnekleri \n" +
            "\t \\ t ile bir boşluk ekleyebilirsiniz.\n" +
            "\t \\ n ile bir alt satıra geçebilirsiniz.\n" +
            "\t \\ r ile satır başına dönebilirsiniz.\n" +
            "\t \\' ile tek tırnak(') karakterini kullabilirsiniz.\n" +
            "\t \\\" ile çift tırnak (\") karakteri kullanabilirsiniz. \n" +
            "\t \\\\ ile ters slash(\\) karakterinin kullanabilirsiniz.\n" +
            "\t \\\$ ile dolar işaretini ($) kullanabilirsiniz.\n"

    println(exampleString)
    //----------------------------------------------------------------------------------------------------

    /**
     *      Unicode karakterleri de tanimlamak icin kullanilabilir.
     */
    val blackHeart = '\u2665'
    println(blackHeart)
    val redHeart ="❤️"
    val heavyBlackHeart = '\u2764'
    println("first commit with $heavyBlackHeart")
    println("first commit with $redHeart")
    
}