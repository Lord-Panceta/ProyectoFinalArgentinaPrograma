package com.example.comparar2

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.comparar2.R.layout.activity_main
import com.example.comparar2.R.layout.activity_main_land


class MainActivity : AppCompatActivity() {
    lateinit var form1EditText: EditText
    private lateinit var palabra1: String
    lateinit var form2EditText: EditText
    private lateinit var palabra2: String
    lateinit var textView2: TextView
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation === Configuration.ORIENTATION_LANDSCAPE) {

            setContentView(activity_main_land)


        } else if (newConfig.orientation === Configuration.ORIENTATION_PORTRAIT) {
            // vertical
            setContentView(activity_main)

        }

    }

    fun comparar() {
        val palabra1 = form1EditText.text.toString()
        val palabra2 = form2EditText.text.toString()

        val areEqual = palabra1 == palabra2

        if (areEqual) {
            textView2.text = "Las cadenas son iguales."
        } else {
            textView2.text = "Las cadenas son distintas."
        }

    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        form1EditText = findViewById(R.id.form1)
        form2EditText = findViewById(R.id.form2)
        textView2 = findViewById(R.id.textView2)
       val compararButton = findViewById<Button>(R.id.button)

        compararButton.setOnClickListener() {
            comparar()
        }



}}