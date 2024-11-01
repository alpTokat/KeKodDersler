package delegation

class MyClass{
    lateinit var LateInitializedProperty: String

    fun initializeProperty(){
        LateInitializedProperty = "Hello World"
    }

    fun printProperty(){
        if (::LateInitializedProperty.isInitialized){
            println("LateInitializedProperty : ${LateInitializedProperty}")
        }else{
            println("LateInitializedProperty has note been initialized yet")
        }
    }
}

fun main() {
    val myClass = MyClass()
    myClass.printProperty()
    myClass.initializeProperty()
    myClass.printProperty()
}