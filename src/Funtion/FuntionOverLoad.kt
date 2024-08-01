package Funtion
fun main() {
    sum (10, 20)
    sum(30.4, 33.4, 53.4)
    sum("sazzad"," marin"," moon")
    println(sum(12.0, 30.0))
}

fun sum (a:Int, b:Int) {
    println(a-b)
}
fun sum(a:Double, b:Double, c:Double){
    println(a+b+c)
}
fun sum( x:String, y:String, z:String){
    println(x+y+z)
}
fun sum(a:Double, b:Double):Double{
    return a+b
}