package classes

fun main() {
    val toyota= Derived2()
    toyota.makeASound()
    Rectangle2().print()
    Derived("alp","Tokat")
}

/**
 *      Bir sinif hic bir classtan miras almiyor olarak yazilsa bile aslinda
 *      Any isimli bir classtan miras almaktadir.
 *
 *      Bu Any class'i open keywordu ile tanimlandigi icin miras alinabilir bir classtir
 *      Ayni zamanda bu classin icindeki functionlarda open keyword'u ile tanimlanmaktadir.
 *      Open keywordu override edilebilir function oldugunu gostermektedir.
 */

class Example:Any(){
//    override fun hashCode(): Int {
//        return super.hashCode()           override edilebilen functionlar
//    }
}

/**
 *      kotlinde classlar default olarak final durumunda bulunur.
 *      Yani final olan classlar miras alinamazlar.
 */
class Base(val sound:String){
    fun makeASound(){
        println("make a sound $sound")
    }
}
//class Derived():Base("asdasdasd"){  -> Car class'ı default olarak final oldugu icin comment kaldirinca hata verir.
//
//}

/**
 *      Inheritance dogru sekilde miras alicak class'i tanimladiktan sonra onun yanina ":" ve miras alinacak class name ve constructor
 *      parantezleriyle birlikte miras alma islemini yapmis oluyoruz.
 *      Miras alinacak classlarin open keywordu ile tanimlanmis olmasi gerekir.
 */
open class Base2(val name:String){
    fun makeASound(){
        println("make a sound $name")
    }
}

class Derived2(): Base2("Toyota"){

}


//open class View(context:Context)
//
//class MyView:View{
//
//    constructor(context:Context) : super(context){
//
//    }
//}


/**
 *      Eger ki override edilebilen bir metod tanimlamak istiyorsak
 *      onune "open" keywordunu koymamiz gerekmektedir.
 *      Bunun yaninda metodun bulundugu classında open ile tanimlanmis yani miras alinabilir bir class
 *      olmasi gerekmektedir.
 */

open class Shape(){
    open fun draw(){/*...*/}
    fun fill(){/*...*/} // open olmadigi icin child classta override edemeyiz.
}
class Circle():Shape(){
    override fun draw() {
        super.draw()
    }
}


/**
 *      super classin open bir function'u childe classin child classinda override edilemesin istiyorsak
 *      child classta override ettigimiz yerde "final" keywordunu kullanmamiz gerekir.
 */

open class Rectange():Shape(){
    final override fun draw() {/*...*/}
}

class ChildRectangle():Rectange(){
//    override fun draw() {
//        super.draw()           -> bu sekilde yaptigimizda Rectange classinda bu fonksiyonu final yaptigimiz icin override edemeyiz.
//    }
    fun asdasd(){
        draw() // draw call edilebilir.
    }
}

/**
 *          propertiesleride override yapmak mumkundur.
 *          Bu islemi override edilecek property'nin basina open koyarak yapilabilir.
 */

open class Shape2(){
    open val vertexCount:Int = 0
}
class Rectangle2() : Shape2(){
    override val vertexCount: Int
        get() = 4
    fun print(){
        println(vertexCount)
    }
}


/**
 *      Child siniflardan nesne olusurulunca nasil bir surec donuyor.
 *      Oncelikle child class super class'i isaret etmek zorunda oldugu icin oncelikle child classin
 *      super class i isaret ettigi yer calisir. Sonrasinda super classin icindeki ustten alta dogru kodlar calisir.
 *      en son olarak child class icindeki kodlar ustten alta dogru calisir.
 */

open class Base3(val name:String){
    init {
        println("initilazing a base class ")
    }
    open val size:Int=
        name.length.also { println("Initializing size in length $it") }
}

class Derived(
    name:String,
    val lastName:String)
    :Base3(name.replaceFirstChar { it.uppercase() }.also { println(it) })  {
        init {
            println("Initializing a Derived class ")
        }
    override val size: Int=
        (super.size + lastName.length).also { println("Initializing size in size $it") }

}

/**
 *      miras alinan classdan birşey call edilmek istenirse "super" keyword'u kullanilmak gerekmektedir
 */
open class Rectangle{
    open fun draw(){
        println("Drawing a rectangle")
    }
    val borderColor:String get() = "black"
}

class FilledRectangle:Rectangle(){
    override fun draw() {
        super<Rectangle>.draw()// arayuz icerisinde yazdigikim class hangi classin draw ı olacagi oluyor.
        println("Filling the rectangle")
    }
    val fiilColor:String get() = super.borderColor
}

