
//  Nested Class:   - Is a class which is created inside another class
//                  - In Kotlin, a nested class is by default static, so its data members and
//                      member functions CAN be accessed without creating an object of the class
//                  - Nested classes CANNOT access the data members of outer classes

class OuterClass{
    //Outer class code
    private var quizName = "Kotlin Quiz"

    class NestedClass{
        //QuizItem
        var question = "Which describes Kotlin the best:"
//        fun getQuizName():String{
//            return quizName //Cannot access the outer class member
//        }
    }

    // Inner Class:     - An Inner Class is a class which is created inside another class with the keyword inner
    //                  - Inner class cannot be declared inside interfaces or non-inner nested classes
    //                  - The advantage of the inner class over nested class is that, it is able to access
    //                      members of its outer class even if they are private
    inner class InnerClass{
        fun viewQuizName(){
            println(quizName)
        }
    }
}

fun main(){
    println("Question one ${OuterClass.NestedClass().question}")
}