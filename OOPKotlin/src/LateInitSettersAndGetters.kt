
fun main(){
    var myCar = Carr()
    myCar.maxSpeed = 200
    println("Max speed is: ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}

open class Carr(){
    lateinit var owner:String
    val myBrand:String = "BMW"
    get(){
        return field.lowercase()
    }

    var maxSpeed: Int = 250
    set(value) {
        field = if(value > 0) value else throw IllegalArgumentException("Maximum speed cannot be less than zero")
    }

    var myModel: String = "M5"
    private set

    init {
        this.owner = "Frank"
        this.myModel = "M3"
    }
}