package Inheritance

fun main(){
    val Student = Student("sazzad", 22, "male", 456)
    val Teachar = Teachar("mushfiq", 27, "male", 34, "CSE")
    val BuisnessMan = BuisnessMan ("Frozen Empire", 40, "male",300000.00)

    Student.display()
    Teachar.display()
    BuisnessMan.display()
}