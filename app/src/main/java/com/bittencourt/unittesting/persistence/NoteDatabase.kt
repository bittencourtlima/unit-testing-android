package com.bittencourt.unittesting.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bittencourt.unittesting.models.Note



@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {
    companion object{
        const val DATABASE_NAME = "NOTES_DATABASE"
    }

    abstract fun getNoteDao(): NoteDao
}