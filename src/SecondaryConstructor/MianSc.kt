package SecondaryConstructor

fun main(){
    var bmw = Cars("BMW", "X5",4,"Black", 2000)

    bmw.display()
    bmw.name = "BMW"
    bmw.model = "X5"
    bmw.wheel = 4
    bmw.color = "Black"
    bmw.modelY = 2019

}