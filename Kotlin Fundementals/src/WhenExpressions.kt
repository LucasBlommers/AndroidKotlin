fun main(){
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3

    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Autumn")
        12, 1, 2 -> println("Winter")
        else -> {
            println("Invalid season")
        }
    }

    //Rebuild of the age app
    var age = 16

    when(age){
        !in 0..20 -> println("You may drink in the US")
        in 18..20 -> println("You may vote now")
        in 16..17 -> println("You may drive now")
        in 0..15 -> println("You are to young")
    }

    var x : Any = 13.37F
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is an Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}