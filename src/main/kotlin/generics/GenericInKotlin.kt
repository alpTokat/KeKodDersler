package generics

class Box<T>(t:T){
    var value = t

    fun <L> foo(l:L){

    }
}

fun main() {
    // basitce intance'ını oluşturabiliriz.
    val box:Box<Int> = Box<Int>(1)

    val box2 = Box(1)//type inference da aldığı deger üzerinden yapılabilir -> tip çıkarımı
    val box3 = Box("Box")


}


/**
 *
 *
 * Declaration-site variant
 *
 */

// out covariant kullanımlar için lazımdır.(kendisi ve SubType'lari geçerli olsun istiyorsak)
//interface Source<? extends T>
interface Source<out T>{
    fun nextT(): T
}

fun demo(strs: generics.Source<String>) {
    val objects: generics.Source<Any> = strs  // Any tipi istenen yere SubType olan String degeri atıyoruz.

}


// in contravariant kullanimlar icin lazimdir. (Kendisi ve SuperType'lari geçerli olsun istiyorsak)
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    val y: Comparable<Double> = x

}

/**
 *
 *  Star-projection
 *
 *  Function<*, String> ifadesi Function<in Nothing, String> olur.
 *  Bu ifade, Function'ın parametrelerinin türlerini berlitmedeğimiz ancak dönüş degeri türünün String olduğu bir
 *  fonksiyon temsil eder. Bu durumda, herhangi bir türden parametre kabul edebiliriz,
 *  ancak dönüş değeri her zaman String olmalıdır. Bu, Kotlin'de Function<in Nothing, String> ile aynı şeyi  ifade eder.
 *  Nothing, diğer tüm türlerin alt türüdür, bu yüzden Function herhangi bir türden parametre kabul edebilir.
 *
 */


/**
 *  Function<Int, *> ifadesi Function<Int, out Any?>.
 *
 *  Bu ifade, hem parametrelerin hem de dönüş değerinin türlerinin belirli bir türle sınırlı olmadığı bir
 *  Function'ı temsil eder. Yani, Function herhangi bir türden parametre kabul edebilir ve herhangi bir türde
 *  dönüş değeri verebilir. Bu durumda, yine Function <in Nothing, out Any?>ile aynıdır; çünkü parametre
 *  türü Nothing(yani herhangi bir tür) ve dönüş değeri türü Any? (yani herhangi bir tür veya nullable olabilir)
 */

class Boxs<T>(val item:T)

fun printBox(box:Boxs<*>){
    val item =box.item
    println("Item: $item")
}

fun demo2(){
    val stringBox = Boxs("Hello, Kotlin")
    val intBox = Boxs(54)

    printBox(stringBox)
    printBox(intBox)

}


/**
 *      Non-nullable generic tipler tanimlama ve kodlama örneği
 */


interface Game<T>{
    fun save(param:T)
    fun load(parma:T & Any)
}

class ArcadeGame<T1> : Game<T1>{
    override fun save(param: T1) {
        TODO("Not yet implemented")
    }

    override fun load(parma: T1 & Any) {
        TODO("Not yet implemented")
    }
}

/**
 *      Type aresure
 *      Kotlin'de generic tanimlamasinda tip bildirimi için gerçekleştirilen tip güvenliği kontrolleridir.
 */

inline fun <reified A, reified B> Pair<*, *>.asPairOf(): Pair<A, B>? {
    if (first !is A || second !is B) return null
    return first as A to second as B
}

val somePair: Pair<Any?, Any?> = "items" to listOf(1, 2, 3)


val stringToSomething = somePair.asPairOf<String, Any>()
val stringToInt = somePair.asPairOf<String, Int>()
val stringToList = somePair.asPairOf<String, List<*>>()
val stringToStringList = somePair.asPairOf<String, List<String>>() // Compiles but breaks type safety!
// Expand the sample for more details





