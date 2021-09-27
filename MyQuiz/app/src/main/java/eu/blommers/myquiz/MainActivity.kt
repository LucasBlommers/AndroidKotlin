package eu.blommers.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eu.blommers.myquiz.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        GlobalScope.run {

            binding.btnStart.setOnClickListener { view ->
                val name = binding.etName.text.toString()

                if(name.trim().isEmpty()){
                    Toast.makeText(this@MainActivity, getString(R.string.enter_name), Toast.LENGTH_LONG).show()
                }else{
                    val intent = Intent(this@MainActivity, QuizActivity::class.java).apply {
                        putExtra("name", name)
                    }
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}