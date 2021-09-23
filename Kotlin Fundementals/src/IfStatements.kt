fun main(){

    var heightPerson1 = 170
    var heightPerson2 = 160

    if(heightPerson1 > heightPerson2){
        println("Use raw force")
    }else if(heightPerson1 == heightPerson2){
        println("Use your power technique 1337")
    }else{
        println("Use technique")
    }

    println("What's your age?")

    var ageString: String? = readLine()
    var age = ageString!!.toInt()

    if(age >= 21){
        println("You may drink in the US")
    }else if (age >= 18){
        println("You may vote in the US")
    }else if (age >= 16){
        println("You may drive in the US")
    }else{
        println("You're to young")
    }
}