package eu.lucasblommers.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val tvOutput = findViewById<TextView>(R.id.tv_calculation_output)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View?){
        val btn = view!! as? Button
        tvOutput.text = "${tvOutput.text} ${btn!!.text}"
    }

    fun onDivide(view: View?){

    }

    fun onMultiply(view: View?){

    }

    fun onSubtract(view: View?){

    }

    fun onClear(view: View?){
        tvOutput.text = ""
    }

    fun onAdd(view: View?){

    }
}