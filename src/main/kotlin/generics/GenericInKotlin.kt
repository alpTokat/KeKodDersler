package generics

fun main() {
    val homeFragment = HomeFragment()
    val dashboardFragment = DashboardFragment()

    homeFragment.call()
    dashboardFragment.call()

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