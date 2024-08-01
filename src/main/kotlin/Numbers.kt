fun main() {
    /**
     *      Byte  ->      8 bit    -> -128 - 127
     *      Short ->     16 bit    -> -32,768 - 32,767
     *      Int   ->     32 bit    -> 2,147,483,648 - 2,147,483,647
     *      Long  ->     64 bit    -> -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807
     *      --------------------------------------------------------------------------------------------
     *      Ondalıklı değişkenler için Float ya da Double tiplerini kullanıyoruz.
     *      Float ->     32 bit -> 8 basamaklı
     *      Double->     64 bit -> 15 basamaklı
     *      ----------------------------------------------------------------------------------------------
     *      Değişken tanımlaması tip belirtmeden sayısal bir değer atanarak yapılırsa
     *      Tip çıkarımı(Type inferences) yapılırken  değer short aralıkta dahi olsa Int olarak
     *      Int aralıktan büyükse Long olarak tanımlanır.
     *
     */

    // Tiplerin min var, max değerlini görmek için aşağıdaki kodu çalıştırın.
    val minByteValue:Byte = Byte.MIN_VALUE
    val maxByteValue:Byte = Byte.MAX_VALUE

    val minShortValue:Short = Short.MIN_VALUE
    val maxShortValue:Short = Short.MAX_VALUE

    val minIntValue:Int = Int.MIN_VALUE
    val maxIntValue:Int = Int.MAX_VALUE

    val minLongValue:Long = Long.MIN_VALUE
    val maxLongValue:Long = Long.MAX_VALUE


    println("Min Byte Value: $minByteValue")
    println("Max Byte Value: $maxByteValue")
    println("Min Short Value: $minShortValue")
    println("Max Short Value: $maxShortValue")
    println("Min Int Value: $minIntValue")
    println("Max Int Value: $maxIntValue")
    println("Min Long Value: $minLongValue")
    println("Max Long Value: $maxLongValue")


    /**
     *  Long değer atamada değerin sonuna L işareti konmalıdır.
     *  Float değer atamada değerin sonuna f ya da F işareti konmalıdır.
     */
    val longNumber = 1586L // L konulmaz ise Int olarak tip çıkarımı yapılır.
    val floatNumber1= 19.80F
    val floatNumber2= 33.33f
    val doubleNumber = 14.01


    /**
     *      Number değişken tanımlanırken aralarına _(underscore) katılabilir. okunurluk için
     */
    val oneMillion = 1_000_000 // = 1000000
    val creditCard = 3455_123_23_32
    val bytes = 0b11010010_01100101

    /*-------------------------------------------------------------------------------------------------------*/
    /**
     *      Boxed: Değişkenin obje referansı olarak tutulması
     *      Unboxed: Değişkenin primitive olarak tutulması
     *      === operatoru degiskenlerin referansinin kontrolde kullanilir
     *      == Degiskenlerin degerlerinin kiyaslanmasinde kullanilir.
     */

    val number1:Int = 127 // primitive(Unboxed)
    val boxedNumber:Int? = number1 //Class type(boxed)
    val anotherBoxedNumber:Int? = number1
    // eger ki class tipi 2 degiskenin referansları kontrol edilirse ve bu iki deger byte
    // number degerleri arasındaysa aynı yeri isaret eder
    println(boxedNumber === anotherBoxedNumber) // True

    val number2:Int = 128 // primitive(Unboxed)
    val boxedNumber2:Int? = number2 //Class type(boxed)
    val anotherBoxedNumber2:Int? =number2
    println(boxedNumber2 === anotherBoxedNumber2)//False

}