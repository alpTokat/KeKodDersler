fun main() {
    /**
     *      8 bitlik yer kaplar.
     *      true yada false deger atamasi icin kullanilir. Nullable olabilir
     */
    val isStudent:Boolean = true
    val isTeacher:Boolean = false
    val isFirstStudentMale:Boolean? = null
    //--------------------------------------------------------------------------------------------
    /**
     *      true ya da false deger dondurdugu icin mantik operatorleri ile birlikte kullanilir.
     *      || (or) && (and) ! (not) ile birlikte
     */

    if (isStudent && isTeacher){

    }
    if (isStudent and isTeacher){

    }
    if (isStudent || isTeacher){


    }
    if (isStudent or isTeacher){

    }
    if (isStudent.or(isTeacher)){

    }
    if (isStudent.and(isTeacher)){

    }

    /**
     *      ||(or) ve &&(and) operatorleri lazy çalışma mantigi ile calisirlar.
     *      ||(or) operatorunun solu true ise sag tarafa bakilmaz.True kabul edilir.
     *      &&(and) operatorunun solu false ise sag tarafina bakılmaksınız false kabul edilir.
     */

    /**
     *      true && true = true     -> iki degerde kontrol edilir.
     *      true && false =false    -> iki degerde kontrol edilir.
     *      false && true = false   ->Sadece ilk degere bakılır.
     *      false && false = false  -> sadece ilk degere bakılır.
     *
     *      true || true = true     -> sadece ilk deger kontrol edilir.
     *      true || false = true    -> sadece ilk deger kontrol edilir.
     *      false || true = true    -> iki degerde kontrol edilir.
     *      false || false = false  -> iki degerde kontrol edilir.
     *
     */


}