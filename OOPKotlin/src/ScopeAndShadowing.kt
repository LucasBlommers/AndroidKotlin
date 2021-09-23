fun main(){
    myFunction(5)
}

//This a is a parameter
fun myFunction(a:Int){
    //a is a variable
    var a = 10
    var b = 4

    println("var a: $a is now ghosting parameter a which is no longer accesible.")
    println("b is $b")
}