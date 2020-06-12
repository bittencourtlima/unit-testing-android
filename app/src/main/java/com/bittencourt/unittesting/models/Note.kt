package com.bittencourt.unittesting.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "notes")
data class Note(
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "timestamp") val timestamp: String): Serializable{

    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0
}