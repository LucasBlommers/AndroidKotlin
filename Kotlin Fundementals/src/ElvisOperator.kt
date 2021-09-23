fun main(){
    var nullableName:String? = "Denis"

    nullableName = null
    //?: - Elvis Operator
    val name = nullableName ?: "Guest"

    println("$name")
    nullableName = "Denis"
    println("${nullableName!!}")
}