package loop

fun main() {
    /**
     *      Degisen hicbir durum yok. Sartli durumlarda kullanilacak dongu while dongusudur.
     *      Bir diger tabirle for-if seklinde tanimlanabilir.
     */
    var number = 0

    while(number < 5){
        print("${number++}, ")
    }

    while(number < 5){
        print("${number}, ")
        number++
    }

    println("------------------------------------------")

    for (value in 1..110){
        if (value <5){
            print("${value}, ")
        }else{
            break
        }
    }
}