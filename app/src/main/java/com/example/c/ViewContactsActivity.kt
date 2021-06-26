package com.example.c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ViewContactsActivity : AppCompatActivity() {
    lateinit var tvName1:TextView
    lateinit var tvEmail2:TextView
    lateinit var tvPhonecall:TextView
    lateinit var imgDetails:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contacts)
        tvName1=findViewById(R.id.tvName1)
        var nameIntent=intent.getStringExtra("name")
        tvName1.text=nameIntent


        tvPhonecall=findViewById(R.id.tvPhonecall)
        var phonecallIntent=intent.getStringExtra("phonenumber")
        tvPhonecall.text=phonecallIntent

        tvEmail2=findViewById(R.id.tvEmail2)
        var emailIntent=intent.getStringExtra("email")
        tvEmail2.text=emailIntent

        imgDetails=findViewById(R.id.imgDetails)
        var imageIntent=intent.getStringExtra("image").toString()
        Picasso.get()
            .load(imageIntent)
            .into(imgDetails)


    }
}