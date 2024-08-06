package controlflow

import java.io.IOException

fun main() {
    /**
     *      if else case'lerinden sonra suslu parantez acilir ve kapanir.
     *      Ancak bu suslu parantezler arasina tek satir kod yazacaksak, suslu parantez kullanmak zorunda degiliz.
     *      If - Else case'lerinin state ve expression olmak uzere 2 kullanimi vardir. Basitce;
     *      State kullanimi sadece if else kullanarak sartli durumlarimizi kodlamaktadir.
     *      Expression kullanimi ise bir value'ya deger olarak esitligin karsi tarafina if else kodlari yazmaktadir.
     *      Expression olarak yapilan kullanima, if else case'leri icin yazilmis parantezlerin son satiri value olarak donecektir.
     */

    print("Enter are you student?")
    val answer = readln()

    // state kullanimi
    if (answer.contains("yes", ignoreCase = true)) {
        println("it's a student")
    } else {
        println("it's not a student")
    }
    print("please enter Y for continue or N for exit")



    // expression kullanimi. {} icerisindeki son satir, deger olarak degiskene atanir.
    val result:String = if(answer == "evet"){
        "öğrenci"
    }else{
        "öğrenci değil"
    }

    print("Please enter a final note: ")
    val grade = readLine()!!.toInt()

    val charNote = if (grade == 100) {
        "$grade = AA"
    }
    else if(grade <=99 && grade >= 80) {
        "$grade = BB"
    }
    else if(grade <= 79 && grade >=50) {
        "$grade = CC"
    }
    else if(grade <= 49 && grade >= 20) {
        "$grade = DD"
    }else if(grade >=20 && grade <=0) {
        "$grade = FF"
    }else{
        "$grade = bulunamadı"
    }
    println(charNote)

    /**
     *      2 farkli tipteki number degiskenler karsilastirilirken equals fonksiyonu once tiplerini karsilastirdigi icin
     *      eger tipler uyusmuyorsa, ide hata verecektir.
     */

    if (10 == 10L.toInt()){ // biri int digeri long olursa ilk tip kontrolu yapacagi icin hata verir. int cevirmek lazim
        println("true")
    }

    /*--------------------------------------------------------------------------------------------------------- */
    /**
     *      Bazi durumlarda if else yazmaktansa, if case'ini yazip return  ya da throw gibi kodun devam etmesini bozacak
     *      ifadelerle kodu sonlandırabilirsiniz. Kod calisirken bu if case'ine girmezse devam eden kod blogu calisir ki
     *      bu da pratikte else case'i demek olur. Bu sekilde yazim kodu biraz daha temiz gosterir.
     */
    val isStudent = false
    if (isStudent){
        println("student")
    }else{
        otherMethod()
    }

    if (isStudent){
        println("student")
        throw IOException()// bu ifadede sonra yazilacak kod calismaz.
    }
}

fun otherMethod(){

}