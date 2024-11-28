package com.example.tickit.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tickit.model.Task
import com.example.tickit.repository.TaskRepository

class TaskViewModel(private val taskRepository: TaskRepository) : ViewModel() {

    fun addTask(task: Task) {
        taskRepository.insertTask(task)
    }

    fun deleteTask(task: Task) {
        taskRepository.deleteTask(task)
    }

    fun updateTask(task: Task) {
        taskRepository.updateTask(task)
    }

    fun getAllTasks(): List<Task> {
        return taskRepository.getAllTasks()
    }

    fun searchTask(query: String?): List<Task> {
        return taskRepository.searchTask(query)
    }
}
