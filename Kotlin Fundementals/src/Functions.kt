fun main(){
    //Arguments
    val result = addUp(5, 3)

    println("Result: $result")
    println("Average between 16 and 5 is: ${average(16.0,5.0)}")
}

//Method - a Method is a function within a class
//Parameter (input)
fun addUp(a:Int, b:Int):Int{
    //Output
    return a+b
}

fun average(a: Double, b: Double):Double{
    return (a+b)/2
}
fun myFunction(){
    println("Called from myFunction")
}