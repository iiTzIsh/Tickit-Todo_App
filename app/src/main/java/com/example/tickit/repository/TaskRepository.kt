package com.example.tickit.repository

import com.example.tickit.sharedpreferences.TaskSharedPreferences
import com.example.tickit.model.Task

class TaskRepository(private val sharedPrefs: TaskSharedPreferences) {

    fun insertTask(task: Task) {
        sharedPrefs.insertTask(task)
    }

    fun deleteTask(task: Task) {
        sharedPrefs.deleteTask(task)
    }

    fun updateTask(task: Task) {
        sharedPrefs.updateTask(task)
    }

    fun getAllTasks(): List<Task> {
        return sharedPrefs.getAllTasks()
    }

    fun searchTask(query: String?): List<Task> {
        return sharedPrefs.searchTask(query)
    }
}
