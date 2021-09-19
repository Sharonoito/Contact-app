package com.example.c.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.c.Contact
import com.example.c.NotesDao


@Database(entities = arrayOf(Contact::class), version = 1)
abstract class ContactsDatabase : RoomDatabase() {
    abstract fun contactDao(): ContactDao
    abstract fun getNotesDao():NotesDao

    //companion object do not need to create an instance to access the object
    //object available to all instances of the class. Does not change when instances are created
    companion object {
        private var database: ContactsDatabase? = null
        fun getDatabase(context: Context): ContactsDatabase {
            if (database == null) {
                database = Room.databaseBuilder(context,
                    ContactsDatabase::class.java, "contactsDb")
                    .fallbackToDestructiveMigration().build()
            }
            return database as ContactsDatabase
        }
    }
}

