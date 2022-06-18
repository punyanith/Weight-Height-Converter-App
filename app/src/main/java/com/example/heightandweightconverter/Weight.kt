package com.example.heightandweightconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class Weight : AppCompatActivity() {

    private lateinit var input : EditText

    private lateinit var output : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight)

        val lbs_to_kg_button = findViewById<Button>(R.id.lbs_to_kg_button)
        val kg_to_lbs_button = findViewById<Button>(R.id.kg_to_lbs_button)

        lbs_to_kg_button.setOnClickListener { convert_lbs_to_kg() }
        kg_to_lbs_button.setOnClickListener { convert_kg_to_lbs() }

        input = findViewById(R.id.input)
        output = findViewById(R.id.output)
    }

    private fun convert_lbs_to_kg() {
        try {
            val lbs = input.text.toString().toFloat()
            val kg = (lbs / 2.205f)
            output.text = "${"%.2f" .format(kg)} kg"
        } catch (e : Exception) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()
        }

    }

    private fun convert_kg_to_lbs() {
        try {
            val kg = input.text.toString().toFloat()
            val lbs = (kg * 2.205f)
            output.text = "${"%.2f" .format(lbs)} lbs"
        } catch (e : Exception) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_LONG).show()
        }
    }
}