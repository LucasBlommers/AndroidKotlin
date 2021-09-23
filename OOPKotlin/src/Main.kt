import models.UserModel

fun main(){
    /* The five basic concepts of OOP (Object Oriented Programming) are:
    1. Variables and types, a variable is a location in memory
        To indicate the storage area, each variable should be given a unique name(identifier)*/
    var myName:String = "Lucas Blommers"
    println(myName)
    /*
    2. Control Flows: To do something conditionally or to repeatedly run code (conditionally)
    */
    if (myName == "Lucas Blommers"){
        println("Welcome back $myName")
    }else{
        println("I can't give you access")
    }
    var friends = arrayListOf<String>("Henk", "Jan", "Melissa")

    for (friend in friends){
        println(friend)
    }

    /*
    3. Functions: Enable us to: separate code, run code blocks when needed
    */
    val currentAge = 31
    val newAge = addAge(currentAge)
    println("Your old age was $currentAge and your new age is $newAge")

    /*
    4. Collection: store multiple elements in one place, iterate through multiple elements (With the help of control flows) */
    val users = arrayListOf<String>("Henk", "Jan", "Ingrid")
    for (user in users){
        println("Username is: $user")
    }
    /*5. Classes and objects (including inheritance): Create our own datatypes,
            keep data members and methods together in one place, write more readable and maintainable code
     */
    val user = UserModel("Lucas Blommers", 31)
    user.printName()
}

fun addAge(age:Int):Int{
    val newAge = age + 1
    return newAge
}