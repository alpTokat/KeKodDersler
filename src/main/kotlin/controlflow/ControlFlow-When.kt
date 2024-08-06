package controlflow

fun main() {
    /**
     *      switch case'lerin yerine gelmistir.
     *      when(karsilastirilacak_ifade){
     *          value -> {}
     *          value -> {}
     *          else -> {}
     *          formatinda kullanilir.
     *          Yine {} arasina tek satir kod yazilacaksa bu durumda {}'leri kullanmayabilirsiniz.
     *      }
     */

    val countryCode = readLine()!!
    when (countryCode.lowercase()) {
        "tr", "az" -> println("Türk vatandaşı")
        "ar" -> println("Arap vatandaşı")
        "fr" -> println("Fransa vatandaşı")
        "en" -> println("İngiliz vatandaşı")
        "ru" -> println("Russian vatandaşı")
    }

//    when (countryCode.toInt()) {
//        3.and(5) -> println("TC vatandaşı")
//        1 or 2 -> println("TC vatandaşı")
//    }


    /**
     *      when'in yanina karsilastirma ifadesi eklemeden, bunu caselerin yanina da ekleyebilirsiniz.
     *      bunun artisi && || and or xor gibi ifadeleri de kullanabilmenizi saglar.
     */

    when{
        countryCode.lowercase()=="tr" && countryCode.lowercase()=="az" -> println("TC vatandaşı")
        (countryCode.lowercase()=="eg").and(countryCode.lowercase()=="bae") -> println("Arap vatandaşı")
    }


    // is !is ile bir class'in referansi olunup olunmadigi kontrolu yapilabilir.
    val phoneNumber:Long = 5326266972
    when (phoneNumber) {
        is Long-> {
            println("long value")
        }
        !is Long ->{
            println("not long value ")
        }

    }


    // rangelerin in !in seklinde kontrolu yapilabilir.
    val number = 3
    when (number){
        in 0..10 ->{
            println("value in 0-10")
        }
        in 11..20 ->{
            println("value in 11..20")
        }
    }
}