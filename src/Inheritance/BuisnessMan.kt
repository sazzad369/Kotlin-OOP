package Inheritance

class BuisnessMan( name:String, age:Int, gender:String, var annoulIncome:Double,):Person(name, age, gender) {
    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
        println("AnnoulIncom: $annoulIncome")
    }
}