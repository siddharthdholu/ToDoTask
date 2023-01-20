package com.todo.todotask.data.repository

import com.todo.todotask.data.dao.IToDoDao
import com.todo.todotask.data.model.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val todoDao: IToDoDao) {

    val getAllTasks: Flow<List<ToDoTask>> = todoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = todoDao.sortTaskByLowPriorities()
    val sortByHighPriority: Flow<List<ToDoTask>> = todoDao.sortTaskByHighPriorities()

    fun getTask(taskId: Int): Flow<ToDoTask>{
        return todoDao.getTask(taskId = taskId)
    }

    suspend fun addTask(toDoTask: ToDoTask){
        todoDao.addTask(toDoTask = toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask){
        todoDao.updateTask(toDoTask = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask){
        todoDao.deleteTask(toDoTask = toDoTask)
    }

    suspend fun deleteAllTasks(){
        todoDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>>{
        return todoDao.searchTasks(searQuery = searchQuery)
    }
}