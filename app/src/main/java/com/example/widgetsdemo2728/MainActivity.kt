package com.example.widgetsdemo2728

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.widgetsdemo2728.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // подключили View Binding
        binding  = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val checkBox = findViewById<CheckBox>(R.id.testbox)

        // можно обратиться через переменную, объявленную явно
        // или использовать  View Binding, см. ниже
        checkBox?.setOnCheckedChangeListener { buttonView, isChecked ->
            // Handle the checked state change here
            if (isChecked) {
                // Checkbox is checked
            } else {
                // Checkbox is unchecked
            }
        }
        binding.testbox.visibility = View.INVISIBLE
        binding.testbox.setOnCheckedChangeListener {
                buttonView, isChecked -> // Handle the checked state change here
            if (isChecked) {
                // Checkbox is checked
            } else {
                // Checkbox is unchecked
            }
        }

    }
}