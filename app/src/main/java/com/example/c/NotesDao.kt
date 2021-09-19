package com.example.c

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.OnConflictStrategy



@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote (note:Note)

    @Query("SELECT * FROM Notes")
    fun getAllNotes():LiveData<List<Note>>

    @Query("SELECT * FROM Notes WHERE noteId =:noteId")
    fun  getNoteById(noteId:Int):LiveData<Note>

    @Delete
    fun deleteNote()

    }
