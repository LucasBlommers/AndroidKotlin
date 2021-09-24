fun main(){
    //Unsafe cast operator: as
    val obj1:Any? = "String unsafe cast"
    val str1:String? = obj1 as String?
    println(str1)

    //val obj2:Any? = null
    //val str2:String = obj2 as String
    //println(str2) //Causes an exception

    //Safe cast operator: as?
    //Returns null if cast fails
    val location: Any = "Kotlin"
    val safeString: String? = location as? String
    val safeInt:Int? = location as? Int
    println(safeString)
    println(safeInt)

}