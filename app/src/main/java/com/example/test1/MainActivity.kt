package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {

    private lateinit var counterView: TextView

    var countClick: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterView = findViewById(R.id.CounterView)
        countClick = 0
        counterView.text = countClick.toString()
    }

    fun clickButtonUpdate (view: View){


        countClick++

        counterView.text = countClick.toString()
    }

    fun clickNextButton (view: View){

        val intent = Intent(this@MainActivity, SecondActivity2::class.java)
        intent.putExtra("count", countClick)
        startActivity(intent)


    }
}

