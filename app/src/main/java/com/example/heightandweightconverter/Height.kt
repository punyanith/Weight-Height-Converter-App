package com.example.heightandweightconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Height : AppCompatActivity() {

    private lateinit var h_input : EditText

    private lateinit var h_output : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_height)

        val cm_to_ft_button = findViewById<Button>(R.id.cm_to_ft_button)
        val ft_to_cm_button = findViewById<Button>(R.id.ft_to_cm_button)

        cm_to_ft_button.setOnClickListener { convert_cm_to_ft() }
        ft_to_cm_button.setOnClickListener { convert_ft_to_cm() }

        h_input = findViewById(R.id.h_input)
        h_output = findViewById(R.id.h_output)

    }

    private fun convert_cm_to_ft() {
        try {
            val cm = h_input.text.toString().toFloat()
            val ft = (cm / 30.48f)
            h_output.text = "${"%.2f" .format(ft)} ft"
        } catch (e : Exception) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()
        }

    }

    private fun convert_ft_to_cm() {
        try {
            val ft = h_input.text.toString().toFloat()
            val cm = (ft * 30.48f)
            h_output.text = "${"%.2f".format(cm)} cm"
        } catch (e: Exception) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()

        }

    }
}