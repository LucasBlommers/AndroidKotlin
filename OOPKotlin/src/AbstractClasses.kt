//Abstract classes cannot be instantiated
//(You cannot create objects of an abstract class)
abstract class Mammal(private val name:String, private val origin:String, private val weight: Double){
    //Abstract property (Must be overridden by Subclasses)
    abstract var maxSpeed:Double

    //Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    //Concrete (Non Abstract) Method
    fun displayDetails(){
        println("Name: $name, Origin: $origin, weight: $weight, Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double)
    :Mammal(name, origin, weight){
    override fun run() {
        //Code to run
        println("Runs on two legs")
    }

    override fun breath() {
        //Code to breath
        println("Breath through mouth or nose")
    }

}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double)
    : Mammal(name, origin, weight){
    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through mouth or trunk")
    }
}

fun main(){

    val human = Human("Lucas", "the Netherlands",
        65.0, maxSpeed = 7.5)
    val elephant = Elephant("Dombo", "India",
    5400.0, 25.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

    human.displayDetails()
    elephant.displayDetails()

}