package com.example.c.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.c.Contact
import com.example.c.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel:ViewModel() {
    val contactsRepository=ContactsRepository()
    lateinit var contactLiveData: LiveData<List<Contact>>

    fun saveContact(contact:Contact){
        viewModelScope.launch {
            contactsRepository.saveContact(contact)
        }

    }
    fun getAllContacts(){
        contactLiveData=contactsRepository.fetchContacts()
    }
}