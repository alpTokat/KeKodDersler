package classes.sealedclass

/**
 * 1-)Visibility modifier konusunda herhangi bir kısıtlanma yoktur.
 * 2-)Primary constructor tanimlanabilir.
 * 3-)init blogu kullanilabilir.
 * 4-)Secondary constructor tanimlanabilmektedir.
 * 5-)Sealed classlar, bir class'i miras alabilmektedir. open, sealed, abstract olmasi fark etmez.
 * 6-)Bu class'lara interfaceleri imlement edilebilmektedir.İmplement edilen interface'in icerisinde body'siz bir
 * fun var ise subClass'lar bu fun'ı override etmek zorundadir.
 *
 * 7-)init ve constructor'u olmasina ragmen sealed class'larin nesneleri direk olarak olusturulamaz.
 * Primary Constructorlari default olarak protected dir. Bu primary constructor icerisine tanimlanan property, sub class
 * larda ister constructor icerisinde ister sabit olarak miras alındığı yerde degeri atanabilir.
 *
 * 8-)companion object tanimi yapılabiliyor.
 *
 * 9-)İcerisinde hali hazirda subClass'lari olan sealed class'lar baska bir class tarafindan miras alinamazlar.
 * Ama bos bir sealed class tanimladiysaniz herhangi bir class'a miras olarak verilebilir.-> daha çok constructor un
 * visibility modifier ile ilgiliymis private ise olmuyor, protected ise oluyor .
 *
 * 10-)İcerisinde normal ve abstract fun tanimlanabiliyor. abstract ise subClass'larda override edilme zorululuğu vardir.
 *
 * 11-)direct class'larin constructorında sealed class'tan bağımsız property'ler tanimlanabiliyor.
 * 12-)Direct class'lar icerisinde companion object tanimlanabiliyor.
 * 13-)Direct classlar icinde fun tanimi yapilabiliyor. normal, open ve abstract şeklinde ama abstract ise
 * direct class'ında abstract olmasi gerekir.
 * 14-)Direct classlarin birden fazla nesnesi olusturulabilir. Enum'larda sabit'ler tek bir nesne olarak memory'de tutulur.
 */

private sealed class Errors(): A(), B{

    class NoInternet(): Errors() {
        override fun someMethod(): String {
            TODO("Not yet implemented")
        }

        override fun doo() {
            TODO("Not yet implemented")
        }
    }

    class ServerError: Errors() {
        override fun someMethod(): String {
            TODO("Not yet implemented")
        }

        override fun doo() {
            TODO("Not yet implemented")
        }
    }

    class FileError: Errors() {
        override fun someMethod(): String {
            TODO("Not yet implemented")
        }

        override fun doo() {
            TODO("Not yet implemented")
        }
    }

    init {

    }

    fun foo(){

    }
    abstract fun doo()
    companion object{

    }
    constructor(errorCode:Int):this()
}

open class A

sealed class F
open class T: F() // direct class direct sub class direct child class
class foo: T() // indirect class,

interface B{
    fun someMethod():String
}


fun main() {
//    val error = Errors()
}