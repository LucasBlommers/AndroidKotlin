package eu.blommers.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eu.blommers.myquiz.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        //Get the result from extra's
        binding.tvResultTotalQuestions.text = intent.extras!!.get("questions").toString()
        binding.tvResultRightAnswers.text = intent.extras!!.get("rightAnswers").toString()

        //Set finish button listener
        binding.btnResultFinish.setOnClickListener {
            val intent = Intent(this@ResultActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}