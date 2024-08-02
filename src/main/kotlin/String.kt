import java.util.*

fun main() {
    /**
     *          Çift tırnak içerisinde yazılan karakterler bütünüdür.
     *          bir string ifadenin tum karakterlerini tek tek char array'e alınabilir.
     */
    val name:String = "Alp"
    val firstCharOfName:Char = 'A'
    val secondCharOfName:Char = 'l'
    val thirdCharOfName:Char = 'p'
    for (nameChar in name){
        println(nameChar)
    }
    val name2:String = (firstCharOfName.toString() +secondCharOfName.toString()+ thirdCharOfName.toString())
    println(name2)

    //-------------------------------------------------------------------------------------------------------------------------------------

    /**
     *      String immutable'dır. Bir string ilk deger atamasi yapildiktan sonra degerini degistiremez  ya da
     *      yeni bir deger set edilemez. Daha once atama yapilan bir String degiskene daha sonra baska bir string deger
     *      ataması yapilirsa yeni bir objeye karsilik gelir. eski degerde bir sure yer tutar yeni degerde yeni  degeri olur.
     *
     */
    var surName2:String = "tokmak"
    surName2 = "kahraman" // daha fazla yer kaplıyor. Yeni bir bellek adresini isaret eder.

    //----------------------------------------------------------------------------------------------------------------------------------

    /**
     *      Farklı tipteki bir degiskenin onune string bir degisken ya da ifade konulup toplanırsa
     *      sonuc string olacaktır.
     *      ama sonrasina katilirsa onceki degeri onemser.
     */

    val valueString:String = "Value is " +(3+1+2)
//    val valueNotString:Int = (3+1+2)+"value" hatada verecektir.


    //----------------------------------------------------------------------------------------------------------
    /**
     *      String.format(), belirli bir string icinde yer tutucuları belirtilen degerlerle degistirerek yeni bir
     *      string olusturmamıza olanak saglar. Yer tutucular, formatlama belirtimleriyle tanimlanir ve bu belirtimler,
     *      degistirilecek degerlerin nasil bicimlendirileceğini kontrol eder.
     *
     *      %s: String icin
     *      %d: Tam sayı(Integer) icin
     *      %f:float sayilar
     *      %n: Yeni bir satira gecmek için
     */

    val yas = 23
    val mesaj = String.format("Yaşım: %d",yas)
    println(mesaj)

    val boy = 1.73
    val boyMesaj = String.format("Benim boyum: %.2f metre", boy)
    println(boyMesaj)

    val ad = "Ahmet"
    val kisiBilgisi = String.format("Adım: %s, boyum: %.2f metre, yaşım: %d", ad, boy,yas)
    println(kisiBilgisi)

    val sayi = 1234567.89
    val usFormat = String.format(Locale.US,"US formatında: %.2f",sayi)
    println(usFormat)

    //Türkçe için locale nesnesi, "tr"
    val localeTR = Locale("tr","TR") //türkce icin locale nesnesi oluşturduk.
    val usFormatTr = String.format(localeTR, "TR formatında: %.2f",sayi)
    println(usFormatTr)





}