package com.bittencourt.unittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bittencourt.unittesting.persistence.NoteDao
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val noteDao: NoteDao by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        noteDao.toString()
    }
}
