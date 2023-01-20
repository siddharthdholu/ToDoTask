package com.todo.todotask.data.model

import androidx.compose.ui.graphics.Color
import com.todo.todotask.ui.theme.HighPriority
import com.todo.todotask.ui.theme.LowPriority
import com.todo.todotask.ui.theme.MediumPriority
import com.todo.todotask.ui.theme.NonePriority


enum class Priority(val color: Color) {
    HIGH(HighPriority),
    MEDIUM(MediumPriority),
    LOW(LowPriority),
    NONE(NonePriority)
}