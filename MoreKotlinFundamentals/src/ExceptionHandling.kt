import java.lang.Exception

fun main(){
    //An exception is a runtime problem which occurs in the program and
    // leads to program termination
    // - Running out of memory      - condition like divide by zero
    // - Array out of bound

    //Four keyword of exception handling:
    // - Try        - Finally
    // - Catch      - Throw
    //Try: The try block contains a set of statements which might generate an exception
    // It must be followed by either catch or finally or both
    try {


        //Throw
        throw Exception("Error, something went wrong")
        //Catch: the catch block is used to catch the exception thrown from the try block
    }catch (exception:Exception){
        println(exception)
        //Finally: The finally block always executes whether the exception is handled or not.
        //          So it is used to execute important code statements. (Like closing buffers)
    }finally {

    }
    val num1 = getNumber("10")
    val num2 = getNumber("10.5")

    println(num1)
    println(num2)
}

fun getNumber(string: String): Int?{
    return try {
        Integer.parseInt(string)
    }catch (exception:Exception){
        null
    }
}