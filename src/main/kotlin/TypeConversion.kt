fun main() {
    /**
     *      2 tür type conversion vardır.
     *          Implicit type conversion:ortulu tip donusumu
     *          explicit type conversion: acik - belirgin tip donusumu
     *
     *          kotlin implicit type conversion'ı desteklemiyor.
     */

    //-----------------------------------------------------------------------------------------------------

    /**
     *      Type conversion çeşitli fonksiyonlar ile yapılmaktadır.
     *      Bu fonksiyonlar:
     *          toInt(), toString(), toLong(), toByte() vb.
     */
    val ageString:String = "23"
    val ageInt:Int = ageString.toInt()

    //----------------------------------------------------------------------------------------------------


    /**
     *          Değer aralığı küçük olan tipler büyük olan tipleri acik olarak(explicit) dönüştürülebilir.
     *          ama büyük olanlar küçük olanlara dönüştürülemez.
     */
    val shortValue:Short = 200
    val intValue:Int = shortValue.toInt()
    val byteValue:Byte = intValue.toByte()

    println(byteValue)//output:-56 but value is 200

}