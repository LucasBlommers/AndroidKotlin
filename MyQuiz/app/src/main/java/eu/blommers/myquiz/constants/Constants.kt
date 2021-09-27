package eu.blommers.myquiz.constants

import eu.blommers.myquiz.R
import eu.blommers.myquiz.models.Answer
import eu.blommers.myquiz.models.Question

object Constants{

    fun getQuestions(): ArrayList<Question>{
        var questions = arrayListOf<Question>()

        val answers1 = arrayListOf<Answer>(Answer("Argentina", true), Answer("Fiji", false),
            Answer("New Zeeland", false), Answer("Germany", false))
        val que1 = Question(1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina, answers1)
        questions.add(que1)

        val answers2 = arrayListOf<Answer>(Answer("India", false), Answer("Fiji", false),
            Answer("Australia", true), Answer("Germany", false))
        val que2 = Question(2, "What country does this flag belong to?", R.drawable.ic_flag_of_australia, answers2)
        questions.add(que2)

        val answers3 = arrayListOf<Answer>(Answer("Kuwait", false), Answer("Belgium", true),
            Answer("Australia", false), Answer("Germany", false))
        val que3 = Question(3, "What country does this flag belong to?", R.drawable.ic_flag_of_belgium, answers3)
        questions.add(que3)

        val answers4 = arrayListOf<Answer>(Answer("Denmark", false), Answer("Germany", false),
            Answer("Brazil", true), Answer("New Zeeland", false))
        val que4 = Question(4, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil, answers4)
        questions.add(que4)

        val answers5 = arrayListOf<Answer>(Answer("Denmark", true), Answer("India", false),
            Answer("Fiji", false), Answer("Argentina", false))
        val que5 = Question(5, "What country does this flag belong to?", R.drawable.ic_flag_of_denmark, answers5)
        questions.add(que5)

        val answers6 = arrayListOf<Answer>(Answer("Germany", false), Answer("India", false),
            Answer("Fiji", true), Answer("Argentina", false))
        val que6 = Question(6, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji, answers6)
        questions.add(que6)

        val answers7 = arrayListOf<Answer>(Answer("Brazil", false), Answer("India", false),
            Answer("Kuwait", false), Answer("Germany", true))
        val que7 = Question(7, "What country does this flag belong to?", R.drawable.ic_flag_of_germany, answers7)
        questions.add(que7)

        val answers8 = arrayListOf<Answer>(Answer("Argentina", false), Answer("India", true),
            Answer("New Zeeland", false), Answer("Australia", false))
        val que8 = Question(8, "What country does this flag belong to?", R.drawable.ic_flag_of_india, answers8)
        questions.add(que8)

        val answers9 = arrayListOf<Answer>(Answer("Argentina", false), Answer("Kuwait", true),
            Answer("New Zeeland", false), Answer("Australia", false))
        val que9 = Question(9, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait, answers9)
        questions.add(que9)

        val answers10 = arrayListOf<Answer>(Answer("Germany", false), Answer("Fiji", false),
            Answer("New Zeeland", true), Answer("Australia", false))
        val que10 = Question(10, "What country does this flag belong to?", R.drawable.ic_flag_of_new_zealand, answers10)
        questions.add(que10)

        return questions
    }
}