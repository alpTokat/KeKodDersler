package companionobject

/**
 * Companion object, object gibidir. tek farkı birisi bağlı olmayan singeltondur.
 * Companion object bir class'a bağlı olan singelton objecttir.
 *  Companion object miras alabilmektedir.
 *
 *
 */

open class BaseFragment

interface SomeFragmentFunction{
    fun foosss()
}

class HomeFragment {
    var valueList:List<Pair<String,Any>> = listOf()

    companion object:SomeFragmentFunction,BaseFragment(){

        const val PI = 3.14 // eger ki sadece bu fragment varken kullanılacak bir degisken varsa
                            //oda companion object icerisinde const olarak yazılır. const val: Compile zamanında bilinir.


        fun newInstance(valueList: List<Pair<String, Any>>):HomeFragment{
            val fragment = HomeFragment()
            fragment.valueList = listOf()
            return fragment
        }

        override fun foosss() {
            TODO("Not yet implemented")
        }
    }
}


fun main() {
    //companion object kullanmadan
    val homeFragment = HomeFragment()
    homeFragment.valueList = listOf()

    // companion object kullanımıyla
    HomeFragment.newInstance(valueList = listOf())
}