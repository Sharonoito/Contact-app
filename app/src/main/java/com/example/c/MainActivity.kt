package com.example.c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.c.ViewModel.ContactsViewModel
import com.example.c.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var button=findViewById<Button>(R.id.btnExplore)
        button.setOnClickListener {
            var intent=Intent(baseContext,ContactActivity::class.java)
            startActivity(intent)
        }
         } }
