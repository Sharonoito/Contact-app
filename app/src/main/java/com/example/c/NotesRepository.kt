package com.example.c

import androidx.lifecycle.LiveData
import com.example.c.database.ContactsDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NotesRepository {
    var db=ContactsDatabase.getDatabase(ContactsApp.appContext)

    suspend fun saveNote(note: Note){
        withContext(Dispatchers.IO){
            db.getNotesDao().insertNote(note)
        }
    }
    fun getAllNotes():LiveData<List<Note>>{
        return db.getNotesDao().getAllNotes()
    }
    fun getNoteById(noteId:Int):LiveData<Note>{
       return db.getNotesDao().getNoteById(noteId)
    }

}