package classes.enumclass

/**
 *      Enum classlarin ozellikleri:
 *      1-) Visibility modifierlarda herhangi bir kisitlama yok
 *      2-)Primary Constructor tanimlanabiliyor.
 *      3-) init blogu kullanilabiliyor.
 *      4-)Secondary constructor tanimlanabiliyor.
 *      5-)Enum classlar baska bir class'i ve enum classlari miras alamazlar.
 *      6-)Interfaceleri implement edebilirler. eger implement edilen interface'in icerisinde body'siz bir fonksiyon varsa
 *      bu durumda ya enum class'in icinde ya da enum sabitlerinin her birinin icinde override edilme
 *      zorunlulugu vardir.
 *      7-)nesneleri uretilemiyor, cünkü primary constructoları private olarak yapılmak zorundadir. default olarak final durumundalar.
 *      8-)Companion object tanimlanabiliyor.
 *      9-) Icerisine fun tanimi yapabilmemize imkan sunuyor.
 *
 *      10-)icerisine abstract fun tanimina izin veriyor ama bunu yaptigimizda tum enum sabitleri bu fonksiyonu override etmek zorunda
 *      olacaktir.
 *
 *      11-) Aslinda enum sabitleri enum classini miras alan birer classtir diyebiliriz.
 *      12-) open bir fun da tanimlanabiliyoruz. enum sabitleri bu durumda override etmek zorunda kalmiyoruz opsiyonel.
 *      13-) Enum sabitlerine constructor tanimlanabiliyor. Ama direkt olarak icine property tanimlanamiyor.
 *      14-) enum sabitleri ordinal ve name diye 2 ayri property'e de sahiptirler
 *      name enum sabitinin ismini birebir doner, toString()'den bagimsizdir.
 *      ordinal enum sabitinin sirasini verir.
 *     */


enum class Team(val starCount: Int) : myInterface {
    FENERBAHCE(3) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    },
    GALATASARAY(4) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    },
    TRABZONSPOR(1) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    },
    BESIKTAS(2) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    },
    SIVASSPOR(0) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    },
    TOKATSPOR(0) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    },
    YOZGATSPOR(0) {
        override fun boo() {
            TODO("Not yet implemented")
        }
    };

    init { //3

    }

//    override fun boo() {
//        super.boo()     ya boyle ya da yukardaki gibi enum sabitlerininin icinde override edilmeli
//    }

    //constructor(type: Int,name:String) : this(type)

    companion object

    fun soo() {

    }
}

interface myInterface {
    fun boo() {

    }
}

fun main() {
    Team.values()
    Team.entries// enum sabitlerinin listeni verir.
    Team.valueOf("BEŞİKTAŞ") // enum sabitleri icerisinde girilen degerin olup olmadıgını kontrol eder. Yoksa hata verir.

    println(Team.BESIKTAS.name) //BESIKTAS sabitinin ismini yazdırır -> output: BESIKTAS
    println(Team.BESIKTAS.ordinal)//BESIKTAS sabitinin sirasini verir. -> output:2
}