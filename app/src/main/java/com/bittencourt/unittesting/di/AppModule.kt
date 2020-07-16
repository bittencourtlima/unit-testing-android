package com.bittencourt.unittesting.di

import androidx.room.Room
import com.bittencourt.unittesting.persistence.NoteDao
import com.bittencourt.unittesting.persistence.NoteDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

object AppModule {

    val module = module {
        single<NoteDatabase> {
            Room.databaseBuilder(androidApplication(), NoteDatabase::class.java ,NoteDatabase.DATABASE_NAME).build()
        }
        single<NoteDao> {
            val database: NoteDatabase = get()
            database.getNoteDao()
        }
    }
}