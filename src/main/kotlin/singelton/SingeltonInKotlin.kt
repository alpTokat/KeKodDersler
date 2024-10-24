package singelton


/**
 *      Kotlin'de object kullanarak singelton olmayan bir class'ı
 *      singelton yapabilmekteyiz. Bu kodun Show Kotlin Bytecode'u incelendiğinde
 *      Java da singelton yapılanların aynısı arka planda bizim için yapmaktadır.
 */
object RetrofitKotlin{
    var baseUrl = "www.google.com"
}


/**
 *  object expression, Kullan- at obje olusturmak icin kullandığımız degiskenlerdir.
 *  bir nesnenin degiskene esitlenmesiyle olusturulur.
 */

interface TextWatcherInterface {
    fun beforeTextChanged(s:CharSequence, start:Int,count:Int,after:Int)
    fun afterTextChanged(s:CharSequence)
    fun onTextChanged(s: CharSequence, start:Int,before:Int,count:Int)
}
open class TextWatcherClass: TextWatcherInterface{
    val surName:String = "asdasdasd"
    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
        TODO("Not yet implemented")
    }

    override fun afterTextChanged(s: CharSequence) {
        TODO("Not yet implemented")
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        TODO("Not yet implemented")
    }
}

fun main() {
    RetrofitKotlin.baseUrl = "http://www.youtube.com"

    // object expression
    val textWatcherInterface = object: TextWatcherInterface { // isimsiz bir interface ya da class olusturuyoruz.
        override fun beforeTextChanged(
            s: CharSequence,
            start: Int,
            count: Int,
            after: Int
        ) {
            TODO("Not yet implemented")
        }

        override fun afterTextChanged(s: CharSequence) {
            TODO("Not yet implemented")
        }

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            TODO("Not yet implemented")
        }

    }

    class Anonymous : TextWatcherClass(){
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
            super.beforeTextChanged(s, start, count, after) // interface'de body olmadığı icin classtakini işaret eder
            super<TextWatcherClass>.beforeTextChanged(s, start, count, after) // hangi class yada interface'in olacağı
        }
    }

    open class A(){
        val age:Int = 34
    }

    class Deneme():A(){
        val name:String = "Alp"

        private fun asdfds(){
            age
        }

        fun demo(){
            val textWatcher = object : TextWatcherClass() {
                override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                    println("$age, $name, $surName")
                }

            }
        }
    }


}




