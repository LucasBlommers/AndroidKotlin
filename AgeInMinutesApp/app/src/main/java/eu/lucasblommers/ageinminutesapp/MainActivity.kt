package eu.lucasblommers.ageinminutesapp

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
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

    private fun clickDatePicker(view:View){
        val myCalendar = Calendar.getInstance()
        val currentYear = myCalendar.get(Calendar.YEAR)
        val currentMonth = myCalendar.get(Calendar.MONTH)
        val currentDayOfMonth = myCalendar.get(Calendar.DAY_OF_MONTH)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->

                val selectedDate = "$dayOfMonth/${month+1}/$year"
                val tvSelectedDate = findViewById<TextView>(R.id.tv_selected_date)
                tvSelectedDate.text = selectedDate

                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                val theDate = sdf.parse(selectedDate)

                val selectedDateInMinutes = theDate!!.time / 60000
                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                val currentDateToMinutes = currentDate!!.time / 60000
                val differenceInMinutes = currentDateToMinutes - selectedDateInMinutes

                val tvAgeInMinutes = findViewById<TextView>(R.id.tv_age_in_minutes)
                tvAgeInMinutes.text = differenceInMinutes.toString()
            }, currentYear, currentMonth, currentDayOfMonth).show()
        }
    }
}