package com.example.test1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.test1.databinding.ActivitySecond2Binding
import kotlin.random.Random

class SecondActivity2 : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySecond2Binding
    private lateinit var randomNumView : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        randomNumView = findViewById(R.id.RandomNumView)
        val countClick: Int = intent.getIntExtra("count",0 )
        randomNumView.text = Random.nextInt(countClick).toString()





    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_second2)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    fun clickBackButton (view: View){

        val intent = Intent(this@SecondActivity2, MainActivity::class.java)
        startActivity(intent)


    }
}