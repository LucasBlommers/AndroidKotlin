import kotlin.random.Random

fun main(){
    //1. ArrayLists are used to create a dynamic array.
    //Which means the size of an ArrayLists can be increased or decreased according to your requirement
    val arrayList = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList.addAll(list)

    for (item in arrayList){
        println(item)
    }
    //2. The ArrayList class provides both read and write functionality

    //3. The ArrayLists follows the sequence of insertion order

    //4. An ArrayList is non synchronized and may contain duplicate elements

    //Exersice ArrayLists
    //Create a list with 5 random numbers
    val numberList: ArrayList<Double> = ArrayList()
    for (i in 0 until 5){
        val random = Random.nextDouble(100.0)
        numberList.add(random)
    }
    println(numberList)
    var total:Double = 0.0
    for (number in numberList){
        total += number
    }
    val average = total/5
    println("The average generated number is: $average")
}