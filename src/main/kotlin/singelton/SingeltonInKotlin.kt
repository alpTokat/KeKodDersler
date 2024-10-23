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

interface TextWatcher{
    fun beforeTextChanged(s:CharSequence, start:Int,count:Int,after:Int)
    fun afterTextChanged(s:CharSequence)
    fun onTextChanged(s: CharSequence, start:Int,before:Int,count:Int)
}

fun main() {
    RetrofitKotlin.baseUrl = "http://www.youtube.com"

    // object expression
    val textWatcher = object: TextWatcher { // isimsiz bir interface ya da class olusturuyoruz.
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
}




