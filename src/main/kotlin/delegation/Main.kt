package delegation


interface Printer{
    fun printDocument()
}

class InkPrinter(): Printer{
    override fun printDocument() {
        println("Ink")
    }

}

class LaserPrinter():Printer{
    override fun printDocument() {
        println("Laser")
    }

}

class DocumentPrinter(isInkPrinter: Boolean){
    private val printer = if(isInkPrinter) InkPrinter() else LaserPrinter()

    fun printDocument(){
        printer.printDocument()
    }
}



// birden fazla class oldugunda ise su sekilde yapilmaktadir.
interface Printer2{
    fun printDocument()
}

class InkPrinter2:Printer2{
    override fun printDocument() {
        println("Ink")
    }

}

class LaserPrinter2: Printer2{
    override fun printDocument() {
        println("Laser")
    }
}

class MixedPrinter: Printer2{
    override fun printDocument() {
        println("Mixed")
    }
}

class DocumentPrinter2(printerType: PrinterType){
    private val printer = when(printerType){
        PrinterType.INK -> InkPrinter2()
        PrinterType.LASER -> LaserPrinter2()
        PrinterType.MIXED -> MixedPrinter()
    }

    fun printDocument(){
        printer.printDocument()
    }
}

class DocumentPrinterD(printer: Printer2):Printer2 by printer

enum class PrinterType{
    INK, LASER, MIXED
}



fun main() {
    // normalde class icindeki function su sekilde kullanılmaktadir.
    val printer = InkPrinter()
    printer.printDocument()

    val printer2 = LaserPrinter()
    printer2.printDocument()

    // design pattern ile şu sekilde
    val inkPrinter = DocumentPrinter(true)
    inkPrinter.printDocument()


    // 2'den fazla sinifli delegation
    val printerType = DocumentPrinter2(PrinterType.INK)


    //delegation pattern ile su sekilde
    val inkPrinterD = InkPrinter2()
    val documentInkPrinter = DocumentPrinterD(inkPrinterD)
    documentInkPrinter.printDocument()


    val laserPrinterD = LaserPrinter2()
    val documentLaserPrinter = DocumentPrinterD(laserPrinterD)
    documentLaserPrinter.printDocument()

    val mixedPrinter = MixedPrinter()
    val documentMixedPrinter = DocumentPrinterD(mixedPrinter)
    documentMixedPrinter.printDocument()





}

