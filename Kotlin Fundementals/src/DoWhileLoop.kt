fun main(){

    var x = 15

    do{
        println("$x")
        x++
    }while (x <= 10)
    println("Do while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10

    while (feltTemp == "cold"){
        roomTemp++

        if(roomTemp >= 20){
            feltTemp = "Comfy"
            println("It's comfy now")
        }
    }
}