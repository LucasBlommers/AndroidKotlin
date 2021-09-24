
//1. Visibility modifiers are keywords which are used to restrict the use of classes,
//   interfaces, methods and properties is Kotlin
//2. These modifiers are used at multiple places such as class header or method body
//3. Visibility Modifiers are categorized into four different types:
//   - public:      A public modified element is accessible from everywhere in the project
//                  It is a default modifier in Kotlin.
//                  All public declarations can be placed at the top of the file

public class Example{
    class Demo{
        public fun hello(){
            println("Hello world")
        }
        fun demo(){
            println("Still a public function")
        }

        public val x = 5
        val y = 10
        //   - private      - A private modifier allows the element to be accessible ONLY within
        //                      the block in which the properties, fields, etc. are declared
        //                  - The private modifier declaration does not allow access outside the scope
        //                  - A private package can be accessible within that specific file
        private val z = 25

        fun viewZ(){
            println(z)
        }
        //   - internal     - The internal modifier is a feature in Kotlin, which is not available in Java
        //                  - The internal modifier makes the field visible only
        //                      inside the module in which it is implemented
        //                  - All the fields are declared as internal which are accessible only inside the module
        //                      in which they are implemented
        internal fun xPlusY(){
            println("X plus Y equals: ${x+y}")
        }
    }
}

        //   - protected    - A protected modifier with a class or an interface allows visibility to its class or
        //                      subclass only
        //                  - A protected declaration (when overridden) in its subclass is also protected
        //                      unless it is explicitly changed
        //                  - The protected modifier CANNOT be declared at top level. (for packages)
        open class Base{
            protected val i = 0
        }
        class derived: Base(){
            fun getValue():Int{
                return i
            }
        }

fun main(){
    //Public example
    val demo = Example.Demo()
    demo.hello()
    //The private "z" val cannot be accessed from outside the demo class
    //except through a getter
    demo.viewZ()
    //The internal can be accessed from within the same module
    demo.xPlusY()

}