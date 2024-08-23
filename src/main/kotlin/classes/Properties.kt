package classes

fun main() {


}
/**
 *      kotlinde properties classlarin icinde "var" keyworud'u ile mutable yada
 *      "val" keyword'u ile sadece okunabilir sekilde tanimlanabilir
 */
class Address{
    var name:String = "Tokat, Alp"
    var street:String = "18002"
    var city:String = "Adana"
    var state: String? = null
    var zip:String = "12345"

    /**
     *      properties tanimlanirken initializer, getter ve setter opsiyoneldir.
     *      bu ozellikleride yazmasak olur.
     *      Ayni zamanda properties tipinide belirtmeden deger atamasi yapilabilir
     *      IDE degere gore type inference(tip cikarimi) yapacaktir.
     */
    var initializer = 1 // type inference
    //var allByDefault  HATA!, ya tip belirtmeliyiz yada initializer yapmaliyiz.

    /**
     *      Bir property'i sadece okunabilir yapabilmek için 2 yöntem vardır;
     *      1-) val keyword'u ile tanimlamak
     *      2-) var keyword'u ile tanimladiktan sonra setterini private yapmak
     */

    val country :String = "Turkey"
    var language:String = "Turkish" // setter private yapmazsak sonradan degistirilebilir
        private set

//    var stringRepresentation:String
//        get() = this.toString()
//        set(value) {
//            setDataFromString(value)
//        }

    /**
     *      biz bir class'ın icerisinde property tanimladigimizda aslinda onun get ve set fonksiyonlarini tanimlamis oluruz.
     *      Yani bir degere esitledigimizde set fonksiyonu, property'i cagirdigimizda get fonksiyonu calisir.
     *      ama arka plan da backing field vardir hatta bu field'a get ve setlerden erisebiliriz.
     */

    var counter = 0 //the initializer assigns the backing field
        set(value) {
            if (value >= 0){
                field = value
                counter = value// sonsuz donguye girer cunku her seferinde field'a set fonksiyonu cagriliyor.HATA!
                //field counter'ın bellekteki yeri yani backing field kısmı
            }
        }

    /**
     *      bir property tanimlanirken initializer yapiliyorsa
     *      backing field olusur ama initializer yapilmiyorsa field yoktur.
     */
    val size = 35
    val isEmpty:Boolean
        get() = this.size == 10 //get fonksiyonu cagrildiginda alan kaplar sonra memoryden silinir.

}

/**
 *      properties kullanimi assagidaki gibidir
 */

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
//    result.country = "ABD" HATA!, val ile tanimladigimiz icine degerini sadece okuyabiliriz, degistirme yapamayiz.
    //...
    return result
}

// property'lerin arka planda tanimlanmasi şu şekildedir.
//var <propertyName>[: <propertyType][= <property_initilizer]
//        [<getter>]
//        [<setter>]



