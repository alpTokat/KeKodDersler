package generics

fun main() {
    calculate(5.toShort(),5) // toplatma islemi yaptirmak istiyoruz ama short mu, byte mı vb bilmiyoruz
                             // Bu durumda o siniflarin en üst sinifi verilir. Number

    val homeFragment = HomeFragment()
    val dashboardFragment = DashboardFragment()

    homeFragment.call()
    dashboardFragment.call()
}

fun calculate (param1: Number, param2: Number): Number {
    return param1.toInt() + param2.toInt()
}

abstract class  BaseFragment(){
    fun <T> printParam(param:T){
        println(param)
    }
}

class HomeFragment: BaseFragment(){
    fun call(){
        printParam(2)
    }
}

class DashboardFragment: BaseFragment(){
    fun call(){
        printParam("Alp")
    }
}