fun main() {
    /**
     *  Bir değişkene null değeri atama yapılabilmesi için değişken tipinin sonuna ? işareti konulur.
     *  Bir değişkene tip verilmezse direkt null değer atanırsa, IDE tip çıkarımı yaparken değişkenin değerini
     *  Nothing? -> hiçbirşey anlamında olarak işaretler.
     *
     *  Javada null olarak tanımladığımız değişkeni kullandığımız zaman program
     *  çalıştığında hatalı olduğunu anlayabiliyorduk.
     *  Kotlinde nullable olan değişkenlerde IDE if koşulu ile null olup olmadığını kontrol etmemizi
     *  yada değişkenin yanına ? ya da !! işareti koyabiliyoruz.
     */


    val name:String? = "Alp"

    if (name !=null){
        name.lowercase()
    }

    name?.uppercase() // yukardaki if koşulu ile aynı. name null ise uppercase çalışmaz.null kontrol yapılır.
    name!!.lowercase()//sen null olup olmadığı ile ilgilenme direk çalıştır.null kontrol yapılmaz

    /* ---------------------------------------------------------------------------------------------------- */
    var result:Int? = 0
    var number1:Int? = null
    var number2:Int? = null

    number1 = readLine()!!.toInt()
    number2 = readLine()!!.toInt()
    //yukarida readLine()'nin null olmayacagini !! isretleriyle söylediğimiz icin alt satirda da nullable kontrolü yapmamıza gerek yok
    result = number1 + number2

    println(result)


}