package Inheritance

class Teachar ( name:String, age:Int, gender:String, var TeacharID:Int, Subject:String ): Person (name, age, gender){
    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("StudentID: $TeacharID")
    }
}