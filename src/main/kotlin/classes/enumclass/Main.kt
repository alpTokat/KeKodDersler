package classes.enumclass

fun main() {
    //Gruplayabildigimiz veri yapilarinda ENUM CLASS kullanilir.
    val fenerbahce = "FENERBAHÇE"
    val galatasaray = "GALATASARAY"
    val besiktas = "BEŞİKTAŞ"

//    val userType = student, teacher, manager, parent
    // Birden fazla secenekli durumlarda bool kullanilmaz bunun icin ENUM CLASSLAR kullanilir.
    val isStudent = false
    val isTeacher = false
    val isManager = true
    val isParent = false

    val studentType= 0
    val teacherType= 1
    val managerType = 2
    val parentType= 3

    val userType= teacherType

    when(userType){
        0->println("Student Type")
        1->println("Management Type")
        2->println("Student Type")
        3->println("Student Type")
    }
}