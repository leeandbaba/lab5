package com.example.uicontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        submit.setOnClickListener {
            var result =0;
            val dialogBuilder = AlertDialog.Builder(this)
            val alert = dialogBuilder.create()
            val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val currentDate = sdf.format(Date())
            if(None.isChecked){
                result += 50
            }
            if(checkbox2.isChecked){
                result += 17
            }
            if(radio1.isChecked){
                result += 16
            }
            if(textview1.isChecked){
                result += 17
            }

            alert.setTitle("Congratulations!, $currentDate you have Scored $result")
            alert.show()

        }
        reset.setOnClickListener {
            checkbox1.isChecked = false
            button1.isChecked =false
            None.isChecked = false
            checkbox2.isChecked = false
            radio1.isChecked = false
            textview1.isChecked=false
        }

    }
}