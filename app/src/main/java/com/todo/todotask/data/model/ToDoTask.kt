package com.todo.todotask.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.todo.todotask.util.Constant.DATABASE_TABLE_TODO

@Entity(tableName = DATABASE_TABLE_TODO)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority

)
