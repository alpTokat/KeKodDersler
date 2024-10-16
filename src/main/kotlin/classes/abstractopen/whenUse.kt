package classes.abstractopen

abstract class AbstractClass {
    abstract val name: String

    abstract fun makeSound()
}
open class OpenClass{
    val name:String = "Alp"
    fun makeSound(){

    }
}

class  AbstractChild: AbstractClass() {
    //Memberlari implement(override) etmediğimizde hata verecektir.
    override val name: String
        get() = TODO("Not yet implemented")

    override fun makeSound() {
        TODO("Not yet implemented")
    }

}

class OpenChild: OpenClass() {
    // burada implement de edebiliriz etmeyedebiliriz.
}