interface Drivable{
    val maxSpeed: Double

    fun drive():String
    fun brake(){
        println("The drivable is braking")
    }
}

//Super class, Parent class, Base Class
open class Vehicle{
    //Properties
    //Methods
}

//Sub class, Base Class or Derived class
open class Car(override val maxSpeed: Double, val name:String, val brand:String): Drivable{
    open var  range: Double = 0.0

    fun extendRange(amount:Double){
        if(amount > 0){
            range += amount
        }
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife:Double) : Car(maxSpeed, name, brand){

    override var range = batteryLife * 5
    var chargerType = "Type1"
    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    override fun drive():String{
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("Brake inside of electric car")
    }
}

fun main(){
    var audiA3 = Car(250.0,"A3", "Audi")
    var teslaSModel = ElectricCar(275.0,"S-Model", "Tesla", 85.0)
    teslaSModel.drive()
    teslaSModel.extendRange(200.0)
    teslaSModel.chargerType = "Type2"
    teslaSModel.drive()
    teslaSModel.brake()
    //Polymorphism
    audiA3.drive(200.0)
    teslaSModel.drive(200.0)
}