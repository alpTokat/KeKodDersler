fun main() {
    /**
     *      Ayni veya Belirtilen tipte birden fazla veriyi tutmamızı saglayan yapilara denilmektedir.
     *
     *      Primitive ve object type olmak üzere iki tanimlama yontemi vardır.
     *      Secilen yonteme gore performans farkliliklari olmaktadir.
     *      Primitive Type: Unobex olarak bilinir. Bir siniftan referans olarak alınmayan arraylerdir.
     *      Kullanimi Ornekleri->
     *          ByteArray(byte[]), ShortArray(short[]),IntArray(int[]),LongArray(long[])
     *          DoubleArray(double[]), FloatArray(float[]), BooleanArray(boolean[]), CharArray(char[])
     *
     *      Object Type:Boxed olarak bilinir. Bir siniftan referans alinarak olusturulan arraylerdir.
     *
     *
     */

    val studentNumber = arrayOf(13, 18, 21, 32, 44)
    val studentName = arrayOf("Ahmet", "Mehmet", "Abdullah", "Eren")
    val firstCharOfName = arrayOf('A', 'M', 'A','E')
    val mixedArray = arrayOf<Any>("Alp", 23,"Gaziosman pasa University", 'A', true)

    val arrayOfNulls = arrayOfNulls<String>(4)
    println(arrayOfNulls.joinToString())

    val emptyArray = emptyArray<String>()
    val emptyArray2:Array<String> = emptyArray


    //-------------------------------------------------------------------------------------------------------

    /**
     *      Arraylar sabit büyüklüktedir. Arraylere ekleme veya cikarma yapildiginda stringte
     *      oldugu gibi memory'de yeni bir array olusturulmasına neden olur.
     */

    var citiesArray = arrayOf("İstanbul", "Hatay","Kars")
    citiesArray += "Sivas"
    citiesArray += arrayOf("Konya","Ankara")
    println(citiesArray.joinToString())

    citiesArray.forEach {
        println(it)
    }
    //----------------------------------------------------------------------------------------------

    /**
     *      Array<Type>(size){higher order function} seklinde de tanimlayabiliyoruz.
     *
     *      Bu durumda higher order function icerisinde son satira denk gelen degerler diziyi olusturur.
     */

    val carNameMini = Array<Double>(5){
        //pseudo code
        //pseudo code
        //pseudo code
        it + 10.0 // son satira denk gelen code return edilir. it indexi gosterir.
    }
    println(carNameMini.joinToString())


    /**
     *      Primitive tipte array oluşturma
     */

    val firstCharOfCountries = CharArray(4)
    firstCharOfCountries[0] ='T'
    firstCharOfCountries.set(1,'U')
    firstCharOfCountries.set(2,'R')
    firstCharOfCountries[3]= 'N'


    //------------------------------------------------------------------------------------------------------

    /**
     *      Arrayler val ile tanimlanmis olsa bile herhangi bir indexindeki deger degistirilebilmektedir.
     *      Ancak ilgili diziye baska bir dizi esitlemesi yapilamaz.
     *      Bunun yapilabilmesi icin var ile tanimlanamalidir.
     *
     */
    val awesomeArray = arrayOfNulls<String>(5)
    awesomeArray[2] = "Alp"
    awesomeArray[2] = "lorem"
    awesomeArray[2] = "ipsum"
//    awesomeArray = arrayOf("foo","boo","goo","doo","loo") //calismaz
    awesomeArray[4]= "Bla bla"
//    awesomeArray[5] = "asndajsnd" // IndexOfBound hatası alırız.Boyutun dısına ciktin 0,1,2,3,4 indexleri var

    //---------------------------------------------------------------------------------------------
    /**
     * 2 boyulu diziler
     */
    val twoDArray = Array(3){Array<String>(3){
       it.toString()
    }}
    for (row in twoDArray) {
        for (element in row) {
            print("$element ")
        }
        println()
    }

    // 3 boyutlu diziler

    val threeDArray= Array(3){Array(3){Array<String>(3){
        it.toString()
    } } }























}