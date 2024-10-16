package classes


/**
 * 1-)Mutlaka primary constructor olmalidir.
 *
 * 2-)Mutlaka en az 1 tane parametre icermek zorundadir.
 *
 * 3-)Parametreleri val yada var olmalilar.
 *
 * 4-)parametreler default deger alabilirler.
 *
 * 5-)init block'una sahip
 *
 * 6-)Secondary constructor icerebilirler
 *
 * 7-)Visibility modifierlari alabilirler.
 *
 * 8-) Open keywordünü alamazlar
 *
 * 9-)Default olarak final tanimlanmistir.
 *
 * 10-)Abstract yada open siniflara miras alabilir.
 *
 * 11-)interfaceleri implement edebiliriz.
 *
 * 12-) Member property tanimlanabilir.
 */

data class PokemonData(val name:String="Alp"){ //1, 2, 3, 4,7,9
    val origin:String = "green" // 12
    constructor(name:String, age:Int) : this(name){ // 6

    }
    init {//5

    }
}

//open data class asdasd(val asasd:String){} Hata verir. 8
