package delegation

import kotlin.collections.mutableMapOf

class Database2{
    private val data = mutableMapOf<String,String>()

    fun saveData(key:String, value:String){
        data[key] = value
        println("Saved $value with key $key to database.")
    }

    fun getData(key:String):String?{
        return data[key]?:"Not found data"
    }
}


class User2(private val db:Database2){
    private var _name:String? = null
    private var _email:String? = null


    var name:String
        get() {
            if (_name == null) {
                _name =db.getData("name")
            }
            return _name?:"Not found name"
        }set(value) {
            _name = value
            db.saveData("name", value)
        }
    var  email:String
        get() {
            if (_email == null) {
                _email =db.getData("email")
            }
            return _email?:"Not found email"
        }set(value) {
            _email = value
            db.saveData("email", value)
        }
}


fun main() {
    val db = Database2()
    val user2 = User2(db)
    user2.name =  "John"
    user2.email = "john@gmail.com"

    println(user2.name)
    println(user2.email)
}
