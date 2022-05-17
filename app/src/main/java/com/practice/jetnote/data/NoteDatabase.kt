package com.practice.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.practice.jetnote.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}