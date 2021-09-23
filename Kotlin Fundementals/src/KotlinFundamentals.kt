
fun main(){

    //Val and var
    //Type inference
    val name = "Frank"
    var otherName = "Henk"
    println("Hello $name and $otherName")
    otherName = "Jan"

    println("Hello $otherName")

    //Integer TYPES: Byte (8 bit), Short (16 bit),
    //Int (32 bit), Long (64 bit)

    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_145_659_567

    //Float types: Float (32 bit) Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = Math.PI

    //Exercise Variables and Datatypes
    var projectName:String = "Android Masterclass"
    var float:Float = 13.37F
    var double:Double = Math.PI
    var int:Int = 25
    var year:Int = 2020
    var long:Long = 18881234567
    var boolean:Boolean = true
    var char:Char = 'a'

    //Exercise Loops
    for (i in 0 .. 10000){
        if (i > 9000){
            println("IT'S OVER 9000!!!")
        }
    }
}
