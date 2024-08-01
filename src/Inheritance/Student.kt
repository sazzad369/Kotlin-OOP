package Inheritance

class Student (  name:String, age:Int, gender:String, var StudentID:Int,): Person (name, age, gender){
    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("StudentID: $StudentID")
    }
}