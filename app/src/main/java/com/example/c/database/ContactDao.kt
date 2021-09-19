package com.example.c.database

import android.security.identity.AccessControlProfileId
import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import com.example.c.Contact
import androidx.room.OnConflictStrategy


@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact: Contact)
    @Query("SELECT * FROM Contacts")
    fun getAllContacts(): LiveData<List<Contact>>
    @Query("SELECT * FROM Contacts WHERE id = :contactId")
    fun getContactById(contactId: Int): LiveData<Contact>
    @Delete
    fun deleteContact(contact: Contact)
}
