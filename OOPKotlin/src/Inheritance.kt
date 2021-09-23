//Super class, Parent class, Base Class
open class Vehicle{
    //Properties
    //Methods
}

//Sub class, Base Class or Derived class
open class Car(val name:String, val brand:String){
    open var  range: Double = 0.0

    fun extendRange(amount:Double){
        if(amount > 0){
            range += amount
        }
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}
class ElectricCar(name: String, brand: String, batteryLife:Double) : Car(name, brand){

    override var range = batteryLife * 5
    var chargerType = "Type1"
    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    fun drive(){
        println("Drove for $range KM on electricity")
    }
}

fun main(){
    var audiA3 = Car("A3", "Audi")
    var teslaSModel = ElectricCar("S-Model", "Tesla", 85.0)
    teslaSModel.drive()
    teslaSModel.extendRange(200.0)
    teslaSModel.chargerType = "Type2"
    //Polymorphism
    audiA3.drive(200.0)
    teslaSModel.drive(200.0)
}