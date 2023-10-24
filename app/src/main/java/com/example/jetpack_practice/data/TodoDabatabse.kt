package com.example.jetpack_practice.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Todo::class],
    version = 1
)

abstract class TodoDabatabse: RoomDatabase() {
    abstract  val dao:TodoDao
}