package com.example.c

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        var rvContact=findViewById<RecyclerView>(R.id.rvContact)
        var contactsList= listOf(
            Contacts("Sharon's Contact","Contact information","Sharon Oito","07182872665","oitosharon@gmail.com"),
            Contacts("Faith's Contact","Contact information","Faith Andati","07012567889","andatifaith@gmail.com"),
            Contacts("Fred's Contact","Contact information","Fred Ogolla","078827635","fredogolla@gmail.com"),
            Contacts("Hellen's Contact","Contact information","Hellen Kiprop","079098877","kiprophllen@gmail.com"),
            Contacts("Afline's Contact","Contact information","Afline Jasmine","071799965","jasmineafline@gmail.com"),
            Contacts("Felix's Contact","Contact information","Felix Otieno","078987664345","otienofelix@gmail.com"),
            Contacts("Petronilla's Contact","Contact information","Petronilla Wambui","0711732688","wambuipetroa@gmail.com"),
            Contacts("Kevin's Contact","Contact information","Kevin Wangola","0723896657","wangolokevin@gmail.com"),

            )
        var contactsAdapter=ContactsAdapter(contactsList)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactsAdapter

    }
}
