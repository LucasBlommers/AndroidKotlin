fun main(){
    //What is a Lambda Expression
    //1. A Lambda is a function which has no name
    //2. Lambda Expressions and anonymous functions are "function literals", i.e functions
    //   that are not declared, but passed immediatly as an expression
    //3. Lambda is defined with curly braces {} which takes variables as a parameter (if any)
    //   and a body of a function
    //4. The body of a function is written after the variables (if any) followed by "->"(arrow) operator
    //5. Syntax: {variable(s) -> body_of_lambda}

    addNumber(5, 10)
    val sum:(Int, Int) -> Int = {a:Int, b:Int -> a + b}
    println(sum(10, 5))

    val sum2 ={a:Int, b:Int -> println(a + b)}
    sum2(10, 5)
}

fun addNumber(a: Int, b:Int):Int{
    val add = a+ b
    println(add)
    return add
}