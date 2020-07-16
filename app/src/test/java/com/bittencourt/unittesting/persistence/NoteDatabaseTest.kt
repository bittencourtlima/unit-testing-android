package com.bittencourt.unittesting.persistence

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Before

internal abstract class NoteDatabaseTest {

    //SUT
    lateinit var noteDatabase: NoteDatabase

    @Before
    fun init(){
        noteDatabase = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            NoteDatabase::class.java
        ).build()
    }

    @After
    fun finish(){
        noteDatabase.close()
    }
}