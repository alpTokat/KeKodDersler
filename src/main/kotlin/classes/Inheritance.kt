package classes

/**
 *      inheritance birden fazla ortak ozelligi olan yani gruplandirilabilir özellikleri olan
 *      classlar icin inheritance ozelligi kullanilir.
 *      kopek ve kedinin bazi ozellikleri aynı oldugu icin animal sinifi icinde
 *      ortak ozellikleri toplayıp miras almasini saglariz.
 *      miras alinabilir classlar icin "open" keyword'u kullanilir.
 */
open class Animal(val name:String = ""){
    var feetCount:Int = 4
    var origin:String = "Sivas"
    var tailShape:String = "oval"


    fun makeASound():String{
        return ""
    }

    fun attackToTheWolf(){

    }
    fun eat(){

    }
    fun dance(){

    }
}

class Dog():Animal("LillyDogVersion"){
}

class Cat():Animal("Lilly"){
}

fun main() {
    val animal = Animal("Lilly")
    val dog = Dog()
    val cat = Cat()

    dog.attackToTheWolf()
    cat.attackToTheWolf()
}


/**
 *      Inheritance(miras alma) android kod ornegi
 */

//open class BaseFragment(val layoutId:Int):Fragment{
//    fun onViewCreated():View{
//        return inflate.inflater(layoutId)
//    }
//
//}

// asagidaki 2 classta code simens yani kendini tekrarlayan kod oldugu icin burda miras almadan yararlanmaliyiz.
/**class DashboardFragment:BaseFragment(R.layout.fragment_dashboard){

}

class ProfileFragment:BaseFragment(R.layout.fragment_profile){
}
 */

// Sinif override edilemez. Sadece propertyler ve functionlar edilebilir.