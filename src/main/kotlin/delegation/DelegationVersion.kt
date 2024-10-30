package delegation

import kotlin.reflect.KProperty


class Database{
    private val data = mutableMapOf<String,String>()

    fun saveData(key:String, value:String){
        data[key] = value
        println("Saved $value with key $key to database.")
    }

    fun getData(key:String):String?{
        return data[key]?:"Not found data"
    }
}


class DatabaseDelegate(private val db: Database, private val key: String) {
    operator fun getValue(thisRef: Any, property: KProperty<*>): String {
        return db.getData(key).toString()
    }
    operator fun setValue(thisRef: Any, property: KProperty<*>, value:String){
        db.saveData(key, value)
    }
}

class User(db:Database){
    var name:String by DatabaseDelegate(db, "name")
    var email:String by DatabaseDelegate(db, "email")
}

fun main() {
    val database = Database()
    val user = User(database)

    //settings value
    user.name = "John Doe"
    user.email = "johndoe@gmail.com"

    println("Username: ${user.name}")
    println("Email: ${user.email}")
}