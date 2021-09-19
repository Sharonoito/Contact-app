package com.example.c

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contacts")

data class Contact(
    @PrimaryKey(autoGenerate = true)@NonNull var id:Int,
    var contactName:String,
    var contactPhoneNumber:String,
    var contactEmail:String,
    var imageUrl:String,
)


