package eu.lucasblommers.ageinminutesapp

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePickerButton = findViewById<Button>(R.id.btn_select_date)
        datePickerButton.setOnClickListener { view ->
            clickDatePicker(view)
        }
    }

    fun clickDatePicker(view:View){
        val myCalendar = Calendar.getInstance()
        val currentYear = myCalendar.get(Calendar.YEAR)
        val currentMonth = myCalendar.get(Calendar.MONTH)
        val currentDayOfMonth = myCalendar.get(Calendar.DAY_OF_MONTH)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->


                Toast.makeText(this, "DatePickerDialog works! $year", Toast.LENGTH_LONG).show()
            }, currentYear, currentMonth, currentDayOfMonth).show()
        }
    }
}