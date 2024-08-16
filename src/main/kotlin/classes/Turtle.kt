package classes


/**
 *      constructor icerisine tanimlanan parametreler val yada var alma yada almama durumuna gore farklilik gostermektedir.
 *      val ya da var alirsa bu parametrelere classin herhangi bir fonksiyonundan erisilebilir ve class dısında nesnesi olusturuldugunda
 *      nesnenin ozelligi gibi erisebilir olur.
 *      Ama val ya da var almadan tanimlanirsa ne nesnesi olusturulunca ne de class icinde
 *      fonksiyonda kullanilamaz
 *
 *      ama istisna olarak init primary construcator un body si oldugu icin ozellik olarak ekledigimiz bir degiskenin icerisine
 *      consturcatordaki degeri atarak erisebiliriz.
 */
class Turtle constructor(mFeetCount:Int=3,val mName:String="Murtle"){ //mFeetCount tanimladik

    // class feautures(Özellikleri)
    var feetCount:Int = 4
    val feetColor:String = "Brown"
    val headCount:Int = 1
    val headColor:String = "Brown"
    val shelterColor:String = "Green"
    val tailCount:Int = 1
    val tailColor:String = "Brown"
    val age:Int = 1
    var name:String = "Tosbik"
    val sex:String = "Female"
    val isMarried:Boolean = true


    init {
        name =mName
        feetCount=mFeetCount // class ozelligi olan feetCount'a mFeetCount(Constractor parameter)'i atadik
        println("Primary constructor created")
    }
    constructor(mName:String="Tosbik", feetCount:Int=4,isMarried:Boolean = true): this(){
        println("Secondary constructor created")
    }
    constructor(mName:String = "Tosbik", mFeetCount: Int = 4,isMarried:Boolean = true,sex:Boolean = true): this("Tosbik",4,true){
        println("Secondary constructor created")
    }
    //class event
    fun makeSound():String{
        return "asdasdasd"
    }
    fun eatMeal(){
//        mFeetCount  hata verir.
    }
    fun walk(){
        mName // hata vermiyor cunki val yada var ile tanimladik
    }
    fun swim(){

    }
}

fun main() {
    val turtleZero:Turtle = Turtle()
    val turtleOne:Turtle = Turtle()
    val turtleTwo:Turtle = Turtle("")
}