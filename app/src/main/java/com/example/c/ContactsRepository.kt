package com.example.c

import androidx.lifecycle.LiveData
import com.example.c.database.ContactsDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher

class ContactsRepository {
    val database=ContactsDatabase.getDatabase(ContactsApp.appContext)

    suspend fun saveContact(contact: Contact) {
            withContext(Dispatchers.IO) {
                database.contactDao().insertContact(contact)
            }
        }
        fun fetchContacts(): LiveData<List<Contact>> {
            return database.contactDao().getAllContacts()
        }
        fun getContactById(contactId: Int): LiveData<Contact> {
            return database.contactDao().getContactById(contactId)
        }
    }
