package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi

class Activity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val animalName = intent.getParcelableExtra<Animal>("animal")
        val animalInfo = intent.getParcelableExtra<Animal>("animal")
        val animalClass = intent.getParcelableExtra<Animal>("animal")

        val textViewName = findViewById<TextView>(R.id.textView11)
        val textViewInfo = findViewById<TextView>(R.id.textView12)
        val textViewClass = findViewById<TextView>(R.id.textView13)

        textViewName.text = animalName?.name
        textViewInfo.text = animalInfo?.info
        textViewClass.text = animalClass?.classanimal
    }
}