package InnerClassAndNestedClass

fun main(args: Array<String>){
    val outer = Outer()
    println(outer.a)
    val nested = Outer.Nested()
    println(nested.b)
    println(nested.callMe())
}

class Outer{
    val a = "Outer of nested class"
    class Nested{
        val b = "Inside of nested class function"
        fun callMe()= "Funtion call in the nested class"
    }
}