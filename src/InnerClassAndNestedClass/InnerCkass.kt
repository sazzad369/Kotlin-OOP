package InnerClassAndNestedClass

fun main(args: Array<String>){

    val outer = Outer1()
    println(outer.a)
    val inner = outer.Inner()
    println(inner.b)
    println(inner.callMe())
}
class Outer1 {
    val a = "Oouter of inner class"
    inner class Inner{
        val b = a
        fun callMe() = "Funtion call in the nested class"
    }
}