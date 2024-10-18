package generics


/**
 * 1-)Eger ki nested class kullaniliyorsa bu class static olur, inner class kullaniliyorsa bu class non static olur.
 * 2-)Main'de nesne olusturulurken bir üst class varsa bu nested class'in nesnei olusturulurken
 *    Üst class'in nesnesi olusturulmasi gerekmez. val viewHolder = RecyclerView.ViewHolder()
 * 3-) İnner class'larda hem üst class'inin hemde inner class'in nesnesi olusturulmalidir.
 *      val viewHolder2 = RecyclerView2().ViewHolder()
 * 4-) Nested class'larda üst classin memberlari kullanılamaz ama inner class'larda
 * üst class'in memberlari kullanılabilir.
 */

class RecyclerView {
    val outerName:String = "RecyclerView"

    class ViewHolder { //nested class -> static
        val nestedName:String = "ViewHolder"

        fun getOuterName():String{
//            return outerName   -> nested class yani static oldugu icin üst class'in memberini kullanamıyor.

            return  nestedName
        }
    }
}

class RecyclerView2{
    val outerName:String = "RecyclerView2"

    inner class ViewHolder {  //inner class -> non static
        val innerName:String  = "ViewHolder2"

        fun getOuterName() : String {
            return outerName // inner class oldugu icin dıstaki class'in memberini kullanabiliyor.
        }
    }
}

fun main() {
    val recyclerView = RecyclerView()
    val viewHolder = RecyclerView.ViewHolder() //nested class'in nesnesini olusturma

    val recyclerView2 = RecyclerView2()
    val viewHolder2 = RecyclerView2().ViewHolder() // inner classta
}