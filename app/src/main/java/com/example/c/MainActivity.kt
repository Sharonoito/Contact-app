package com.example.c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnExplore=findViewById<Button>(R.id.btnExplore)

        btnExplore.setOnClickListener {
            var intent=Intent(baseContext,ContactActivity::class.java)
            startActivity(intent)
        }
    }
}