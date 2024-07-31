fun main(){
    /**
     * Kotlinde herşey nesnedir. Diğer dillerden farklı olarak primitive tipleri kotlinde
     * Sınıf(class) gibi görünür ama bu sınıf değişkenlerini optimizasyonla pritimite tipe dönüştürülebilir.
     *
     *
     * -----------------------------------------------------------------------------------------------------
     * bir değişken oluşturmak için val ya da var anahtar kelimeleri kullanılır kullanılır.
     * val -> Değeri sonradan değiştirilemeyen değişkendir. "Value" kelimesinin kısaltmasıdır.
     * var -> Değeri sonradan değişebilen değişkendir. "Variable" kelimesinin kısaltmasıdır.
     *
     *
     * Val değişkenleri genelde immutable olarak bilinsede bu yanlış bir bilgidir.
     * Doğrusu ise val değişkeni read-only değişkendir.
     * İlk değeri atandıktan sonra bir daha değiştirilemez sadece değeri okunabilen değişken demektir.
     * Aşağıda box sınıfı içerisinde örneği verilmiştir.
     *
     * ------------------------------------------------------------------------------------------------------
     * var değişkeninin set() özelliğini private yaparak val yapılabilir.
     **/
}




class box(){
    var width:Int = 5
    var height:Int = 10
    val area:Int
        get() = width * height //width ya da height değeri değişirse area'da değişir.(not immutable,yes read-only)
}

class User{
    val name:String = "Alp"
    var surname:String = "Tokat"
        private set // bu komuta kaldırırsak tekrar değer atanabilir.
}
fun TestUser(){
    val user = User()
//    user.name = "PLA";     Comment'i kaldırırsanız hata alırsınız.
//    user.surname = "Tokat"
}