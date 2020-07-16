package com.bittencourt.unittesting.persistence

import androidx.lifecycle.LiveData
import androidx.room.*
import com.bittencourt.unittesting.models.Note
import io.reactivex.Single

@Dao
interface NoteDao {

    @Insert
    fun insertNote(note: Note): Single<Long>

    @Query("SELECT * FROM notes")
    fun getNotes(): LiveData<Note>

    @Delete
    fun deleteNote(note: Note)

    @Update
    fun updateNote(note: Note): Single<Int>
}