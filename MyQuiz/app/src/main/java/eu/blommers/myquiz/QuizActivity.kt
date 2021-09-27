package eu.blommers.myquiz

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.view.children
import eu.blommers.myquiz.constants.Constants
import eu.blommers.myquiz.databinding.ActivityQuizBinding
import eu.blommers.myquiz.models.Answer
import eu.blommers.myquiz.models.Question
import kotlinx.coroutines.GlobalScope
import kotlin.random.Random

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding

    private var questions: ArrayList<Question> = arrayListOf()

    private var selectedBtn: Button? = null
    private var selectedAnswer: Answer? = null

    private var currentQuestion = 0
    private var rightAnswers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        GlobalScope.run {
            val loadedQuestions = Constants.getQuestions()

            //Randomize the questions
            for (i in 0 until loadedQuestions.size){
                val randomIndex = Random.nextInt(0, loadedQuestions.size)
                questions.add(loadedQuestions[randomIndex])
                loadedQuestions.removeAt(randomIndex)
            }
            //Setup progressbar
            binding.pbQuiz.max = questions.size
            binding.pbQuiz.progress = 1
            binding.tvProgress.text = "1/${questions.size}"

            //Load first question
            loadQuestion()

            //Setup submit button
            binding.btnSubmit.setOnClickListener {
                onSubmit()
            }
        }
    }

    private fun loadQuestion(){
        val question = questions[currentQuestion]
        //Set question tex
        binding.tvQuestion.text = question.question
        //Set image
        if(question.image != null){
            binding.ivFlag.setImageResource(question.image)
        }

        //Set the buttons
        for (answer in question.answers){
            val btn = Button(this@QuizActivity)
            btn.text = answer.answer

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                btn.setBackgroundColor(getColor(R.color.grey))
            }else{
                btn.setBackgroundColor(resources.getColor(R.color.grey))
            }

            btn.setOnClickListener {
                selectAnswer(answer, btn)
            }
            binding.llAnswers.addView(btn)
        }
    }

    private fun selectAnswer(answer: Answer, button: Button){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            button.setBackgroundColor(getColor(R.color.light_green))
        }else{
            button.setBackgroundColor(resources.getColor(R.color.light_green))
        }

        when(selectedBtn){
            null -> {
                selectedBtn = button
                selectedAnswer = answer
            }
            button -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    selectedBtn!!.setBackgroundColor(getColor(R.color.grey))
                }else{
                    selectedBtn!!.setBackgroundColor(resources.getColor(R.color.grey))
                }
                selectedBtn = null
                selectedAnswer = null
            }
            else -> {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    selectedBtn!!.setBackgroundColor(getColor(R.color.grey))
                }else{
                    selectedBtn!!.setBackgroundColor(resources.getColor(R.color.grey))
                }

                selectedBtn = button
                selectedAnswer = answer
            }
        }
    }

    private fun onSubmit(){
        if (selectedBtn == null){
            Toast.makeText(this@QuizActivity, getString(R.string.select_an_answer), Toast.LENGTH_LONG).show()
        }else{
            if(selectedAnswer!!.rightAnswer){
                rightAnswers++
            }
            if (currentQuestion == (questions.size - 1)){
                //Start Result activity
                val resultIntent = Intent(this@QuizActivity, ResultActivity::class.java).apply {
                    putExtra("questions", questions.size)
                    putExtra("rightAnswers", rightAnswers)
                }
                startActivity(resultIntent)
                finish()
            }else {
                currentQuestion++
                binding.llAnswers.removeAllViews()
                updateProgressBar()
                loadQuestion()
            }
        }
    }

    private fun updateProgressBar(){
        binding.pbQuiz.progress = (currentQuestion + 1)
        binding.tvProgress.text = "${currentQuestion + 1}/${questions.size}"
    }
}