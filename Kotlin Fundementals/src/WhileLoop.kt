fun main(){
    //While loops executes a block of code repeatedly as long as a given condition is true
    var x = 1
    while (x <= 10){
        if (x == 10){
            print("$x")
        }else {
            print("$x,")
        }
        x++
    }

    println("\nWhile loop is done")

    var y = 100
    while (y >= 0){
        if (y%2 == 0){
            println("$y")
        }
        y--
    }
}