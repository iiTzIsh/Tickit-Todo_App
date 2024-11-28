package com.example.tickit.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Task(
    val id: Int,
    val taskTitle: String,
    val taskDesc: String,
    val reminderDate: Long, // Store the date and time as a timestamp
    val reminderTime: Long
) : Parcelable
