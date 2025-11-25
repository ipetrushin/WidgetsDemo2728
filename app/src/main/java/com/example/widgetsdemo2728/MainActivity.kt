package com.example.widgetsdemo2728

import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val checkBox = findViewById<CheckBox>(R.id.testbox)
        checkBox?.setOnCheckedChangeListener { buttonView, isChecked ->
            // Handle the checked state change here
            if (isChecked) {
                // Checkbox is checked
            } else {
                // Checkbox is unchecked
            }
        }

    }
}