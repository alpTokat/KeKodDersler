package function

fun main() {
    repeat(10){
        runAndPrint ({message->
            println(message)
        },{
            println(it)
        })
    }

}

inline fun runAndPrint(run:(String)->Unit, noinline logger:(String)->Unit) {
    log(logger)
    run("Message")
    logger("End")
}

fun log(logger:(String)->Unit){
    logger("Start")
}