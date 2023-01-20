package com.todo.todotask.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.todo.todotask.data.dao.IToDoDao
import com.todo.todotask.data.model.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): IToDoDao
}