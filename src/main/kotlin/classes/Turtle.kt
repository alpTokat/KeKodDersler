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

    /**
     *      kotlinde visibility modifier olarak kullanilabilecek 4 adet keyword vardır. Public, Private, Protected, İnternal
     *      Bu visibility modifierlar degiskenlerde sadece get ve set uzerinde degisiklik yaparlar.
     *     public ile tanimlanmis bir degiskende get ve set fonksiyonlari bulunurken
     *     private ile tanimlanan bir degiskende get ve set fonksiyonları bulunmaz
     *      bir sinifin icerisinde tanimlana degiskenler aslinda property'dir.
     *      sadece icerisindeki degerler alan kaplar.
     *     getter ve setter fonksiyonlarina gore erisilebilirler. direk erisim yoktur.
     *
     * asagidaki kodun java karsiligina baktigimizda private olarak tanimlandigini goruruz.
     */
    var feetCountColor:String = "Brown"
        set(value) { // arka planda tanimlamasi bu sekilde aslinda bu bir degisken degil fonksiyon.
            field = value
        }get() {
            return field
        }
    //Asagidaki kod ise private olarak belirttiginiz icin getter and setter fonksiyonlari olmaz.
    private var feetCountColor2:String = "Brown"


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