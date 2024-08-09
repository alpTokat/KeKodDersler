

package function


fun main() {
    /**
     *  Uzerinde degisiklik yapamadigimiz(ReadOnly) siniflara, ya da yapmak istemedigimiz siniflara, bu siniflarin
     *  icerisinde yazmadan fonksiyon tanimlayabilmemizi saglar.
     *  Boylece o sinifa ute fonksiyon kazandirabiliriz. Bunu yaparken unutmamamiz gereken; yazdiginiz extension fonksiyon
     *  aslinda o sinifin gercek bir fonksiyonu olmayacaktir.
     *
     *  Yapisal olarak;
     *
     *  fun String.extPrint(handsome:HandSomeOne):Unit{
     *
     *  }
     */

    // normalde degiskenlere deger atayip, print islemini asagidakiler gibi yapariz.
    val pi:Double = 3 + 0.14
    println("Double number: $pi")

    val schoolNumber:Int = 1341
    println("Int number: $schoolNumber")

    val tcIdentityNumber:Long = 18609080306
    println("Long number: $tcIdentityNumber")

    // yukardaki kullanimlarin yerine asagidaki gibi bir log2 fonksiyonu yazilabilir ve asagidaki gibi kullanilabilir.
    function.log2(pi)
    log2(schoolNumber)
    log2(tcIdentityNumber)

    log2(pi,"Double number")
    log2(schoolNumber,"Int number")
    log2(tcIdentityNumber,"Long number")

    pi.log("Double number")
    schoolNumber.log("Int number")
    tcIdentityNumber.log("Long number")

    /*---------------------------------------------------------*/
    // extension fonksiyonlar ister direkt value'ler uzerinden cagrilabilir
    (3+0.14).log("")
    1341.log("")
    18609080306.log("")

    //isterseniz de degiskenler uzerinden
    pi.log("Double number")
    schoolNumber.log("Int number")
    tcIdentityNumber.log("Long number")
}

//extension function global degildir hangi classta tanimlandiysa onun icinde kullanilir.
class FOOA(){
    infix fun Number.log(emptyParam:String){
        println(this.toString() + emptyParam)
    }
    fun foo(){
        34.log("asdasdasd") // yukardaki extension calisir.
    }
}







fun log2(number:Number){
    println("$number")
}
fun log2(number:Number, dataType:String){
    println("$dataType $number")
}


infix fun  Number.log(dataType:String){
    println("$dataType $this")
}