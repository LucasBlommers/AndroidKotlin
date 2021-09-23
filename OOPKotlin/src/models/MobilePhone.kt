package models

import java.util.*

fun main(){
    val samsungGalaxyS20Ultra = MobilePhone("Android", "Samsung", "S20 Ultra")
    samsungGalaxyS20Ultra.charge(30)
}

class MobilePhone(osName:String, brand:String, model:String) {

    var battery:Int = 0

    init {
        val randomCharge = Random().nextInt(50)
        battery = randomCharge
        println("A mobile phone object with OS: $osName, brand: $brand and model $model has been created")
    }

    fun charge(amountOfCharge:Int){
        println("The battery had $battery charge and is increased by: $amountOfCharge")
        if(this.battery + amountOfCharge > 50){
            this.battery = 50
        }else{
            this.battery += amountOfCharge
        }
        println("The battery charge now is: ${this.battery}")
    }
}