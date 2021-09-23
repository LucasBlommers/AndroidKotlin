package models

class UserModel(var name: String,var age:Int) {
    fun printName(){
        println(this.name)
    }
}