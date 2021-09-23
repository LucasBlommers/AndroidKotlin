fun main(){

    var lucas = User("Lucas", "Blommers", 31)
    lucas.hobby = "Gaming"
    lucas.stateHobby()

    var john = User()
    john.hobby = "Hiking"
    john.stateHobby()
}

//Primary constructor
class User(var firstName:String = "John", var surname:String = "Doe"){
    //Member variable - properties
    var age: Int? = null
    var hobby:String = "Watch Netflix"
    //Primary initializer
    init {

    }

    //Member secondary Constructor
    constructor(firstName: String, surname: String, age: Int):this(firstName, surname){
        //Secondary initializer
        this.age = age

        println("Initialized a new User object with $firstName $surname and age $age")
    }



    //Member functions - Methods
    fun stateHobby(){
        println("$firstName $surname's hobby is: $hobby")
    }
}