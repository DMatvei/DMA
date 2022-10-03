package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterView = findViewById(R.id.CounterView)
    }

    fun ClickButtonUpdate (view: View){
        val countString = counterView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        counterView.text = count.toString()
    }
}

