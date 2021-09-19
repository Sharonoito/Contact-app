package com.example.c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.c.ViewModel.ContactsViewModel
import com.example.c.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityAddContactBinding
    val contactsViewModel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
        binding.btnAddContact.setOnClickListener {
            saveContact()
        }

    }
    fun saveContact(){
        var name = binding.etName.text.toString()
        var phone = binding.etEmail.text.toString()
        var email = binding.etphoneNumber.text.toString()


        var error=false
        if (name.isEmpty()|| name.isBlank()){
            error=true
            binding.textInputLayout.error="Name is required"
        }

        if (email.isEmpty() || email.isBlank()){
            error=true
            binding.textInputLayout.error="Email is required"
        }
        if (phone.isEmpty() || phone.isBlank()){
            error=true
            binding.textInputLayout.error="Phone is required"
        }
        if (!error){
            var contact=Contact(0,name,phone,email,"")
            contactsViewModel.saveContact(contact)
            binding.etName.setText("")
            binding.etEmail.setText("")
            binding.etphoneNumber.setText("")
        }
}}

