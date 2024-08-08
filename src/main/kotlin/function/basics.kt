package function

import java.util.*

fun main() {
    takeSquare(2)
    val squareNumber = takeSquare(3)

    //bir class'ın fonksiyonunu çağırmak istedigimizde . ile cagiririz.
    Math.pow(2.0, 3.0)

//    default degeri olan parametreler sahip bir fonksiyon cagrilirken, default degeri olan parametreler deger vermek
//    sart degildir. default degeri olan bu parametreler opsiyonel parametrelerdir.
//    Default degeri olan parametrelere deger atanmadan fonksiyon cagrilacaksa bu durumda parametre sirasi dikkat edilmeli
//    Ide'ye hangi parametreye deger atadigimizi soylemek icin Named Arguments'leri kullanmamiz gerekir.
    reformatMessage("Message",true, 7,"tr")
    reformatMessage(message = "Message",size=7, lang = "tr")
    reformatMessage("Message", true,7)
    reformatMessage("Message", size = 7)

    //vararg kullanimina ornek. key=3'den onceki parametreler vararg parametresine denk gelir.
    getUserInfo("Alp","Tokat", "Adana","Türkiye", "","","", key = 3)

    //vararg parametresi olarak arrayOf kullanilmak istenirse * operatoru eklenmelidir. (spread operatoru)
    // bu operator pointer anlamina gelmez. Kotlinde pointerlar yoktur.
    getUserInfo(*arrayOf("Alp","Tokat", "Adana","Türkiye", "","",""), key = 3)
    getUserInfo3(3,"Alp","Tokat", "Adana","Türkiye", "","","")
    getUserInfo4(2,"Alp","Tokat", "Adana","Türkiye", "","","",true,3.14,"")
}

fun takeSquare(number: Int):Int{
    //asdasdasda
    //asdasdasdasdasd
    //asd
    //dsds
    return (number*number)
}

fun reformatMessage(message:String,isUpperCase:Boolean = false,size:Int,lang:String = "tr"){
    val locale  = if(lang =="tr"){
        Locale("TR","tr")
    }else{
        Locale.ROOT
    }

    val localMessage = if(isUpperCase){
        message.uppercase(locale)
    }else{
        message.lowercase(locale)
    }

    println("Message : $localMessage")

}

/**
 *      Cok uzun sayisa parametreniz olacaksa "variable number of arguments" - vararg tanimlanabilir.
 *      Bu sayede fonksiyon tek bir parametre aliyor gibi gozukurse kendisine cok miktarda degisken alabilir.
 *      Bu degiskenler array'e erisir gibi erisebilirsiniz.[index] ya da .get(index) seklinde
 *
 *      vararg tek ya da son parametre olarak yazilirsa, Jvm'e hazirlanirken, Java'daki "String..." gibi ayni kod derlenir.
 *      Ancak vararg param birden fazla tanimlanirken ortada ya da basta yer alirsa, Jvm'e hazirlanirken, Array'e Donusturlur.
 *      Bu da performans farki olusturur demektir.
 */

fun getUserInfo(vararg userInfo:String,key:Int){
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(vararg userInfo:String){
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo3(key:Int, vararg userInfo:String){
    userInfo[3]
    userInfo.get(3)
}
fun getUserInfo4(vararg userInfo:Any){
    userInfo[3]
    userInfo.get(3)
}