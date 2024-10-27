package scopefun


data class User(val name:String, val age:Int)

class Student{
    var name:String = ""
    var age:Int = 0

    fun someUserFun(user:User?){
        //null point check icin let yada run  scope functionlar kullanilmaktadir.

        val foo = user?.let { // null degilse bu blok
            5
            null
        }?:run {// null ise bu blok calisacaktır
            4
        }

        val boo = user?.also {
            5
            null
        }?:run {
            4
        }


        println(foo)
        println(boo)

        //nullable olmayan degerler icin with(){} scope function kullanılır.

        with(user!!){

        }

    }
}


fun main() {
    //Klasik şekilde nesne olusturma islemi ama düzensiz ve kullanımı daha static
//  -------------------------------------------
//    val user = User("John", 29)
//    val stundent = Student()
//
//
//    println(user.name)
//    println(user.age)
//
//    println(stundent.name)
//    println(stundent.age)
//
    val student = Student().apply {
        name = "John"
        age = 29
    }

    val student2 = Student().also{
        it.name = "John"
        it.age = 29
    }

    println(student.name)
    println(student2.name)



    val user = User("Max", 29).apply {

    }

    val user2 = User("Max", 29).also {

    }



    student2.someUserFun(user)























    // apply ve also ile nesne tanimlanabiliyorken neden diğer scope fun'lar ile yapılamamaktadir.

//    val student3 = Student().run{
//        name = "John"
//        age = 29
//    }
////    println(student3.name) output: error -> cunku run scope'unda higher order'ın son satırı geri döner
//    val student4:Student = Student().run{
//        name = "John"
//        age = 29
//        this
//    }
//    println(student4.name) // calissa bile run scope'unda son satirinda donen deger çok anlamsız oluyor.
//
//
//    val student5:Student = Student().let{
//        it.name = "John"
//        it.age = 29
//        it
//    }
//
//    println(student5.name)
//
//    val student6:Student = with(Student()){
//        name = "John"
//        age = 29
//        this
//    }
//
//    println(student6.name)
}