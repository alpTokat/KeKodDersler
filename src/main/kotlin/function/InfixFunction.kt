package function

fun main() {
    val isStudent = true
    val isMale = true

    /**
     *      and, or, xor gibi bircok infix fonksiyon vardir.
     */

    if (!isStudent and isMale){
        println("Öğrenci olmayan erkek")
    }

    //infix kullanimi
    isStudent and isMale// asagidaki ile ayni sey aslinda ama bu daha okunakli
    isStudent.and(isMale)

    val awesomeInstance = AwesomeClass()
    //infix kullanimi
    awesomeInstance donwloadImage "google.com" // asagidaki ile ayni isi yapmasina ragmen daha okunaklidir.
    awesomeInstance.donwloadImage("google.com")

    //--------------------------------------------------------------------------------------------

    val number = 5
    // matematiksel operatorler, tip donusumleri(type conversion), range kullanimin, infix methodlara karsi islem onceligi vardir.
    if (number + number - 2 *(awesomeInstance specialPlus 4 ) == 5 ) { // bu islemde oncelikle matametiksel ifadeler isleme alinir .

    }
    /*-----------------------------------------------------------------------------------------------*/

    //infix fonksiyonlarda mantiksal operatorlere gore onceliklidir.
    if(number ==3 && number>5 || awesomeInstance specialPlus 4 == 5){

    }

}

class AwesomeClass{
    infix fun donwloadImage(imageUrl:String){
        println("Resim ${imageUrl} indiriliyor.")
    }

    infix fun specialPlus(number:Int):Int{
        return 4
    }

    //bir sinifin icindeyken this kullanimi size bulundugunuz sinifi isaret eder.
    //asagidaki kullanimda AwesomeClass().downloadImage(imageUrl) kullanimi olusur aslinda.(implicit)
    fun logWhenImageDownloaded(imageUrl:String){
        donwloadImage(imageUrl)
//      donwloadImage imageUrl
        this donwloadImage imageUrl
    }
}