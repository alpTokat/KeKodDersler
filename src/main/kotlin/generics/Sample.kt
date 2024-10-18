package generics

fun main() {
    calculate(5.toShort(),5) // toplatma islemi yaptirmak istiyoruz ama short mu, byte mı vb bilmiyoruz
                             // Bu durumda o siniflarin en üst sinifi verilir. Number
}

fun calculate (param1: Number, param2: Number): Number {
    return param1.toInt() + param2.toInt()
}