package reflection

import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.jvm.isAccessible


class Account private constructor(val branchName:String, val branchCode:Int){
    private var balance:Long =324521312312
    private val accountName:String = "Hirda Hesap"

    private fun sendMoneyFromBalance(sendedMoney:Long){
        balance = balance - sendedMoney
    }

}

fun main() {

    val constructor = Account::class.primaryConstructor
    constructor?.isAccessible = true
    val account: Account = constructor?.call("Adana",2) as Account
    println(account.branchName)

    Account::class.memberProperties.forEach {
        println(it.name)
    }

    val account2:Account= constructor.call("")
}