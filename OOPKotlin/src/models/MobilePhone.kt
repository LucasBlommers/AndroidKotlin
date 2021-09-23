package models

fun main(){
    val samsungGalaxyS20Ultra = MobilePhone("Android", "Samsung", "S20 Ultra")
}

class MobilePhone(osName:String, brand:String, model:String) {

    init {
        println("A mobile phone object with OS: $osName, brand: $brand and model $model has been created")
    }
}