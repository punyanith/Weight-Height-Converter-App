package com.example.heightandweightconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.view.View

import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weight_button.setOnClickListener {
            val intent = Intent(this, Weight:: class.java)

            startActivity(intent)
        }

        height_button.setOnClickListener {
            val intent_h = Intent(this, Height:: class.java)

            startActivity(intent_h)
        }
    }
}

