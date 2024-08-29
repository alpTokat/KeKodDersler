package classes

/**
 *      İnterfaces ile ilgili notlar;
 *          1-) İnterfacelerin  Constructorlari olamaz. Bundan dolayi nesneleri olusuturulamaz.
 *
 *          2-) object expression ile nesnesi olusturulabilir. object : interfaceName{Override Functions} Şeklinde
 *          Bu şekilde kullanimda interfaceler sanki bir class gibi hareket ederler.
 *
 *          3-)İnterface icerisinde body'si olan bir function, default deger alan bir parametre gibi
 *          override edilme zorunluluğu ortadan kalkar. Opsiyonel olur.
 *
 *          4-)Interfaceler kendi icinde hiyerarsi olusturulabilir. Yani bir interface baska bir interface'i
 *          miras alabilir. Fonksiyonlari implement ederek kullanabilir.
 *
 *          5-)Miras alan interface icinde override ediliyorsa bir function
 *          mainde kullanilirken override etme zorunluluğu ortadan kalkar.
 *
 *          6-)Bir class birden fazla interface'i implement edebilir. Bir interface bir class'i
 *          miras alamaz.
 *
 *          ONEMLİ! -> Abstract classlar state tutabilir ama interfaceler state tutamaz. Deger tutamama ikisi arasindaki
 *          en buyuk farktir.
 *          Interfacelerde backing field yoktur.
 */


interface TextWatcher{
    fun onTextChanged()
    fun beforeTextChanged()
    fun afterTextChanged()

    fun funWithBody(){//3.Nolu not(Normalde override et diye kızar.)

    }

    fun childFun()
}

open class BaseClass{

}

interface ChildInterface: TextWatcher { //4.Not
    override fun childFun() {
        TODO("Not yet implemented")
    }
}

//interface BaseInterface:BaseClass{
//          6.Nolu Not comment ac hata verir.
//}

fun main() {
    //    val textWatcher = TextWatcher() -> 1.Nolu not

    // 2.Nolu not
    val textWatcher = object : TextWatcher {
        override fun afterTextChanged() {
            TODO()
        }

        override fun childFun() {
            TODO("Not yet implemented")
        }

        override fun beforeTextChanged() {
            TODO("Not yet implemented")
        }

        override fun onTextChanged() {
            TODO("Not yet implemented")
        }
    }

    //5 nolu Not
    val childInterface = object : ChildInterface {
        override fun beforeTextChanged() {
            TODO("Not yet implemented")
        }

        override fun onTextChanged() {
            TODO("Not yet implemented")
        }

        override fun afterTextChanged() {
            TODO("Not yet implemented")
        }
    }
}