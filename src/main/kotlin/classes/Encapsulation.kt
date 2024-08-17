package classes

class Encapsulation {
    var name:String = "Alp"
    private val surName:String = "TOKAT" // aslinda burda field'ı private yapmıyoruz o her zaman private biz sadece set ve get'i private yapıyoruz.


//    val fullName:String = "$name $surName"
    //asagidaki function ile aslinda yukardaki degisken tanimlama gibi gorunen sey aynı sey (ikiside property). Calistirinca hata verir.
    fun getFullName():String{
        return "$name $surName"
    }



}

fun main() {
    val encapsulation = Encapsulation()
    encapsulation.name = "Mahmut" // encapsulation.setName("Mahmut") bu durum get ve setleri public oldugunda gecerli
    //property private ise get ve set ozelliklerini kullanamayiz.
//    encapsulation.surName = "Mert" //hata verir

}