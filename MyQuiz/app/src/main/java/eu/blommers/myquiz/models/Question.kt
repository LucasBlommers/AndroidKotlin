package eu.blommers.myquiz.models

data class Question (
    val id: Int,
    val question: String,
    val image: Int?,
    val answers: ArrayList<Answer>

)