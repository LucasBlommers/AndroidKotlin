
data class Book(val id: Long, var title:String)

fun main(){
    val book:Book = Book(1, "The Life Of Denis")
    println(book)
    val title = book.title
    println(title)

    book.title = "The Life Of Lucas"

    val book2 = Book(1, "The Life Of Lucas")

    println(book == book2)

    val updatedBook = book.copy(title = "The Life Of Brian")
    println(book)
    println(updatedBook)

    println(updatedBook.component1()) // prints 1
    println(updatedBook.component2()) // prints The Life Of Brian

    val (id, updatedTitle) = updatedBook
    println("id=$id, title=$updatedTitle")
}