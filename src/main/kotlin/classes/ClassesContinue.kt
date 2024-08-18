package classes

fun main() {

    /**
     * nesne olusturma class ismi ve constructor parantezlerini acilarak tanimlanir.
     * javadaki gibi new keyword kullanmamiza gerek yoktur.
     */
    initOrderDemo("hello")
    Customer("alp")
    Person3("Alp","Tokat",21) // bu sekilde de call edebilirim
    Person3("Alp","Tokat",21,false) // bu sekilde de call edebilirim. Default yapmak opsiyonel yapmak
    Constructor(1)

//    DontCreateMe("Alp") constructorlar private oldugu icin nesne olusturulamaz

}

/**
 *      Bir sinif olusturmak istiyorsak oncelikle "class" keywordunu yazdiktan sonra
 *      hemen yanina "sinif ismini" yazmaliyiz daha sonrasinda eger ki primary constructor yoksa suslu parantezler acilip kapatilir.
 */
class Person{

}

/**
 *      body'si olmayan bos bir class tanimlamakta mumkundur.
 */
class Empty

/**
 *      Kotlin'de 2 adet Constructor vardır. Bunlar;
 *      Primary Constructor:class basliginda, ve sinif isminden sonra tanimlanir. opsiyonel olarak parametre alabilir.
 *      constructor keywordu yazilmasada olur. bunlarin icinde bir business logic yazamayiz(runnable code)
 *      Bunu yapabileceğimiz yer yani constructorun bodysi "init" keywordu ve bunu takiben curly braceslarin icine yazilabilir.
 *      constructor parametreleri init blocklari icersinde kullanilabilirler.
 *
 *      Secondary Constructor:her bir secondary constructor eger primary constructor varsa onu isaret etmelidir.
 *      bunun icin secondary constructor parametre parantezlerinden sonra ":" koyduktan sonra this(primary parameter) seklinde tanimlanmaktadir.
 */

class PersonWithPrimaryConstructor constructor(firstName:String){

}
class PersonWithPrimaryConstructor2 (firstName:String){

}


class initOrderDemo(name:String){
    val firstProperty = "First Property: $name".also(::println) // first output
    init{
        println("First initializer block that prints $name") // second output
    }
    val secondProperty = "Second Property: ${name.length}".also { println(it) } // third output
    init {
        println("second initializer block that prints ${name.length}") // fourth output
    }
}

class Customer(name:String){
    val customerKey = name.uppercase().also { println(it) } // alternatif name.uppercase().also(::println) higher order function yani println'in referansi degil body kismini al diyoruz "::" bu isaret ile
}

/**
 *      primary constructorda val ve var keyword'u ile property tanimlanabilmektedir.
 */
class Person2(val firstName:String, val lastName:String,var age:Int){

}

/**
 *  primary constructor da property tanimlamalarina default valuelar atanabilmektedir.
 *  class call edilirken default degeri olan parametrelere deger atamasi yapma zorunlulugum ortadan kalkar.
 */
class Person3(val firstName:String, val lastName:String,var age:Int,var isEmployed:Boolean = true)


/**
 *      secondary constructor primary constructor u isaret etmelidir.
 *
 */

class Person4(val name:String){
    val childer:MutableList<Person4> = mutableListOf()
    constructor(name:String, parent:Person4):this(name){
        parent.childer.add(this)

    }
}

/**
 *      Primary constructorunuz olmasa bile siz secondary constructor tanimladiginizda
 *      this() ile primary constructor'u isaret etmeseniz bile secondary constructor cagrildiginda ilk primary constructor'un
 *      init blogu calisacaktir.
 */

class Constructor{
    init {
        println("Init block") // first run this block
    }
    constructor(i:Int){
        println("Constructor $i") //secondary running this block , because secondary constructor delegate to hidden  to primary constructor
    }
}


/**
 *      bir class'ın dısarda nesnesini olusturulmasini istermiyorsak
 *      constructor'a private yapmamiz yeterlidir.
 */

class DontCreateMe private constructor(){
    init {

    }
    private constructor(name:String):this(){
        println("hello I'm $name")
    }
}