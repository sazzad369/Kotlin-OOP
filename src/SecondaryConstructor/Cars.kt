package SecondaryConstructor

class Cars {
    var name:String =""
    var model:String =""
    var wheel:Int = 0
    var color:String =""
    var modelY:Int = 0
    constructor()
    constructor(name:String){
        this.name = name
    }
    constructor(name: String, model:String){
        this.name = name
        this.model = model
    }
    constructor(name:String, model:String, wheel:Int){
        this.name = name
        this.model = model
        this.wheel = wheel
    }
    constructor(name:String, model:String, wheel:Int, color:String){
        this.name = name
        this.model = model
        this.wheel = wheel
        this.color = color
    }
    constructor(name:String, model:String, wheel:Int, color:String, modelY:Int){
        this.name = name
        this.model = model
        this.wheel = wheel
        this.color = color
        this.modelY = modelY
        println("Name : $name}")
        println("Model : $model}")
        println("Wheel : $wheel}")
        println("Color : $color}")
        println("Model Year : $modelY}")
    }

    fun display(){
        println("Name : ${name}")
        println("Model : ${model}")
        println("Wheel : ${wheel}")
        println("Color : ${color}")
        println("Model Year : ${modelY}")
    }
}