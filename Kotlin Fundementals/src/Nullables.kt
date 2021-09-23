fun main(){

    var name:String = "Dennis"

    name = "Adam"
    var nullableName:String? = "Dennis"
    //nullableName = null

    val len = name.length
    //? - Safe mark operator
    val len2 = nullableName?.length

    println("$len2")
    //Old fashiond way of dealing with nullables
//    if(nullableName != null){
//        val len2 = nullableName.length
//    }else{
//        null
//    }


}