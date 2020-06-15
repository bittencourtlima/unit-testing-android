package com.bittencourt.unittesting.models

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NoteTest{

    private val TIMESTAMP_1 = "TIMESTAMP_1"
    private val TIMESTAMP_2 = "TIMESTAMP_2"

    @Test
    internal fun isNoteEqual_identicalProperties_true() {
        //Arrange
        val note1 = Note(title = "title1", content = "content1", timestamp = TIMESTAMP_1)
        val note2 = Note(title = "title1", content = "content1", timestamp = TIMESTAMP_1)

        //Acts

        //Assertions
        assertEquals(note1, note2)
    }

    @Test
    internal fun isNoteEqual_differentId_false(){
        //Arrange
        val note1 = Note(title = "title1", content = "content1", timestamp = TIMESTAMP_1)
        note1.id = 1
        val note2 = Note(title = "title1", content = "content1", timestamp = TIMESTAMP_1)
        note2.id = 2

        //Acts

        //Assertions
        assertNotEquals(note1, note2)
    }

    @Test
    internal fun isNoteEqual_differentTimestamps_false(){
        //Arrange
        val note1 = Note(title = "title1", content = "content1", timestamp = TIMESTAMP_1)
        val note2 = Note(title = "title1", content = "content1", timestamp = TIMESTAMP_2)

        //Acts

        //Assertions
        assertNotEquals(note1, note2)
    }
    @Test
    internal fun isNoteEqual_differentTitles_false(){
        //Arrange
        val note1 = Note(title = "title1", content = "content1", timestamp = TIMESTAMP_1)
        val note2 = Note(title = "title2", content = "content1", timestamp = TIMESTAMP_1)

        //Acts

        //Assertions
        assertNotEquals(note1, note2)
    }

    @Test
    internal fun isNoteEqual_differentContent_false(){
        //Arrange
        val note1 = Note(title = "title1", content = "content1", timestamp = TIMESTAMP_1)
        val note2 = Note(title = "title1", content = "content2", timestamp = TIMESTAMP_2)

        //Acts

        //Assertions
        assertNotEquals(note1, note2)
    }



}