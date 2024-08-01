package PrimaryConstructor

class Cars(var name: String, var model: String, var wheel: Int, var color: String, var modelY: Int) {
    fun display(){
        println("Name: $name")
        println("Model: $model")
        println("Number of wheels: $wheel")
        println("Color: $color")
        println("Year: $modelY")
    }
    init{
        var sum = 20+30
        println(sum)
        println("Name: ${name.capitalize()}")
        println("Model: $model")
        println("Number of wheels: $wheel")
        println("Color: $color")
        println("Year: $modelY")
    }
}