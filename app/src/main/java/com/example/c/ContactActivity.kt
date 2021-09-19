package com.example.c

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.c.ViewModel.ContactsViewModel
import com.example.c.databinding.ActivityContactBinding

class ContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityContactBinding
    val contactsViewModel:ContactsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
         }

    override fun onResume() {
        super.onResume()
        contactsViewModel.getAllContacts()
        contactsViewModel.contactLiveData.observe(this,{contacts->
            displayContacts(contacts)
        })
        binding.fabSaveContact.setOnClickListener {
            startActivity(Intent(this,AddContactActivity::class.java))
        }

        }
    fun displayContacts(contactsList: List<Contact>){
//        var contactsAdapter=ContactsAdapter(contactsList,baseContext)
        var rvContact=findViewById<RecyclerView>(R.id.rvContact)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        var contactsAdapter=ContactsAdapter(contactsList,baseContext)
        rvContact.adapter=contactsAdapter

    }

    }


