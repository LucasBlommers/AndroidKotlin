package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var tvOutput:TextView

    private var lastNumeric = false
    private var lastDot = false
    private var lastCalculation = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvOutput = findViewById<TextView>(R.id.tv_calculation_output)
    }

    fun onDigit(view: View?){
        if(!lastCalculation){
            val btn = view!! as? Button
            tvOutput.append(btn!!.text)
            lastNumeric = true
        }

    }

    fun onDecimalPoint(view: View?){

        if (lastNumeric && !lastDot && !lastCalculation) {
            tvOutput.append(".")
            lastDot = true
            lastNumeric = false
        }
    }

    fun onOperator(view: View?){
        if (lastNumeric && !isOperatorAdded(tvOutput.text.toString())){
            tvOutput.append((view as Button).text)
            lastNumeric = false
            lastDot = false
            lastCalculation = false
        }
    }

    fun onClear(view: View?){
        tvOutput.text = ""
        lastNumeric = false
        lastDot = false
    }

    fun onEqual(view: View?){
        if(lastNumeric){
            var tvValue = tvOutput.text.toString()
            var prefix = ""
            try {
                if (tvValue.startsWith("-")){
                    prefix = "-"
                    tvValue = tvValue.substring(1)
                }
                if(tvValue.contains("-")){
                    val splitValue = tvValue.split("-")
                    var left = splitValue[0]
                    var right = splitValue[1]

                    if(!prefix.isEmpty()){
                        left = prefix + left
                    }

                    tvOutput.text = removeZeroAfterDot((left.toDouble() - right.toDouble()).toString())
                }else if(tvValue.contains("+")){
                    val splitValue = tvValue.split("+")
                    var left = splitValue[0]
                    var right = splitValue[1]

                    if(!prefix.isEmpty()){
                        left = prefix + left
                    }

                    tvOutput.text = removeZeroAfterDot((left.toDouble() + right.toDouble()).toString())
                }else if(tvValue.contains("*")){
                    val splitValue = tvValue.split("*")
                    var left = splitValue[0]
                    var right = splitValue[1]

                    if(!prefix.isEmpty()){
                        left = prefix + left
                    }

                    tvOutput.text = removeZeroAfterDot((left.toDouble() * right.toDouble()).toString())
                }else if(tvValue.contains("/")){
                    val splitValue = tvValue.split("/")
                    var left = splitValue[0]
                    var right = splitValue[1]

                    if(!prefix.isEmpty()){
                        left = prefix + left
                    }

                    tvOutput.text = removeZeroAfterDot((left.toDouble() / right.toDouble()).toString())
                }
            }catch (e:Exception){
                println(e)
            }
            lastCalculation = true
        }
    }

    private fun isOperatorAdded(value:String):Boolean{
        return if (value.startsWith("-")){
            false
        }else{
            value.contains("/") || value.contains("*")
                    || value.contains("+") || value.contains("-")
        }
    }
    private fun removeZeroAfterDot(result:String):String{
        var value = result
        if(result.endsWith(".0")){
            value = result.substring(0, (result.length - 2))
        }
        return value
    }

}