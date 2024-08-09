package function

fun main() {
    calculateAtomPyhsics()
    fun calculateAtomPyhsics2() {

    }
    calculateAtomPyhsics2()
}

class PrivateA(){
    private fun commonFunction(){ // bu private olsa bile reflection ile erisilebiliyor.
        fun specialField(){ // bu fonksiyona disardan asla erisilemez.
//            asdasdasdad
        }
    }
}

fun foo(){

    val privateA = PrivateA()
//    privateA.commonFunction()
//    privateA.specialField
}



fun calculateAtomPyhsics() {
    val userName = "Codemy"
    println("İnitialize Process...")

    fun getValuesFromUserAndPrint(){
        userName.length
        val numberOne = readLine()!!.toInt()
        val numberTwo = readLine()!!.toInt()
        val result = numberOne+numberTwo
        println("$result")
    }
    getValuesFromUserAndPrint()

    println("process has been done")
}


/**
 *      bir sinifin icersindeki fonksiyonlara uye fonksiyon denilmektedir.
 */
class Car{
    fun setColor(colorCodeId:Int){

    }
}
/*------------------------------------------------------------------------*/

/**
 *      Bir fonksiyon generic tip aliyorsa, generic fonksiyon olarak adlandırılır.
 */
fun <T> setColor(colorCodeId: T){

}
