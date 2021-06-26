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
            Contacts("Sharon Oito","07182872665","oitosharon@gmail.com","https://images.unsplash.com/photo-1612989472578-54dc66d757ec?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60"),
            Contacts("Faith Andati","07012567889","andatifaith@gmail.com","https://images.unsplash.com/photo-1614090965443-3df21c6906ec?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=80" ),
            Contacts("Fred Ogolla","078827635","fredogolla@gmail.com","https://expertphotography.com/wp-content/uploads/2020/05/male-poses-squint.jpg" ),
            Contacts("Hellen Kiprop","079098877","kiprophllen@gmail.com","https://images.unsplash.com/photo-1611601679655-7c8bc197f0c6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDV8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"),
            Contacts("Afline Jasmine","071799965","jasmineafline@gmail.com","https://images.unsplash.com/photo-1620232828434-0b385fda6204?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGFmcmljYW4lMjBsYWR5fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80"),
            Contacts("Felix Otieno","078987664345","otienofelix@gmail.com","https://static.boredpanda.com/blog/wp-content/uploads/2018/04/social-experiment-guy-created-fake-tinder-profile-hot-model-pictures-germanlifter-5acdd429b307f__700.jpg"),
            Contacts("Petronilla Wambui","0711732688","wambuipetroa@gmail.com","https://pbs.twimg.com/profile_images/1265569542991945729/6jQGV8he.jpg"),
            Contacts("Kevin Wangola","0723896657","wangolokevin@gmail.com","https://netstorage-legit.akamaized.net/images/bd00d9358adfe705.jpg"),

            )
        var contactsAdapter=ContactsAdapter(contactsList, baseContext)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactsAdapter

    }
}
