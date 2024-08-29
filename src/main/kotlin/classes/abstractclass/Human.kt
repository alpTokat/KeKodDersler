package classes.abstractclass

import jdk.jfr.Event

abstract class Human(val name:String, /*val eventManager:EventManager*/) {

    val eyeColor:String = "Brown"
    open val surName:String = "Tokat" //-> open olan propertyler default deger alir.
    //    abstract val surName:String = "Tokat" -> abstract propertyler initializer olamazlar.override edilebilirler.
    abstract val surName2:String
    abstract val middleName:String


    constructor(name:String,age:Int):this(name){

    }

    fun sentEvent(){
//        eventManager.sendEvent(name)
    }
    open fun getEventType(){
//        eventManaget.getEvent(name)
    }
    abstract fun display() // abstract funlarin bodyleri yoktur. kesinlikle override edilmeli orda body tanimlanir.Assagida Alp Classida yaptım.
}

class Alp():Human("Alp"){
    override val surName2: String
        get() = "tokat"
    override val middleName: String
        get() = "Alper"

    override fun display() {

    }
}

//Abstract classlar baska abstract classlari miras alabilir.

abstract class Turk(eventManager:Event, override val middleName: String):Human("Turk"){
//    override val surName2: String ="Turkoglu" // yukarda parametre olarak abstract olan propertyler deger atamasi yapilmadan yazilabiliyor
    //Cünkü parametreler nesne olusturulurken deger atamasi gerektigi icin
    abstract val skinColor:String
}

open class Kurt(eventManager: Event, override val middleName: String):Human("Kurt"){
    override val surName2: String ="Kurtoglu"
    override fun display() {
        TODO("Not yet implemented")
    }
}

//class Sivas(override val surName2: String):Turk(eventManager = asdasd, middleName = "Sivas"){ // en alt child class bütün parent ozelliklerini kullanabilir.
//    override val skinColor: String= "asdasd"
//    override fun display() {
//        TODO("Not yet implemented")
//    }
//
//}

fun main() {
//    val human = Human("Alp") -> abstract class'in instance'i olusturulamaz diye uyarıcı verecektir.
    //Ama neden constructor tanimlayabiliyoruz dersek, başka bir classı inject etmek istediğimizde
    //Bu class'in icinde inject edilecek class'in nesnesini olusturmak yerine parametre olarak almak icin kullanilir.
}