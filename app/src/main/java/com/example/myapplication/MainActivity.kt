package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val snake = Animal("snake", "Info", "reptile")
        val chicken = Animal("chicken", "Info", "domestic fowl")
        val wolf = Animal("wolf", "Info", "hound")

        val buttonDetails1 = findViewById<Button>(R.id.button3)
        buttonDetails1.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animal",snake)
            startActivity(intent)
        }

        val buttonDetails2 = findViewById<Button>(R.id.button1)
        buttonDetails2.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animal",chicken)
            startActivity(intent)
        }
        val buttonDetails3 = findViewById<Button>(R.id.button2)
        buttonDetails3.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("animal",wolf   )
            startActivity(intent)
        }
    }
}