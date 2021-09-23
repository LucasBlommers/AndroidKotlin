fun main(){
    var lucas:Person = Person("Lucas", "Blommers")
    var john = Person()
    var johnPeterson = Person(surname = "Peterson")

}

class Person(firstName: String = "John", surname: String = "Doe"){

    init{
        println("Person created with firstname: $firstName and surname: $surname")
    }
}