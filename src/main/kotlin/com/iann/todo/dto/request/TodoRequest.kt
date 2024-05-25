package com.iann.todo.dto.request

import com.iann.todo.entity.Todo
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import lombok.Builder
import java.sql.Date
import java.sql.Timestamp
import java.time.LocalDateTime

data class TodoRequest(
    val todoId: Long? = null,

    @NotBlank
    @Size(min = 0, max = 20)
    val title: String,

    @Size(min = 0, max = 200)
    val desc: String,
    val isComplete: Boolean = false,
    val startDate: Date,
    val endDate: Date
) {

    fun toEntity(): Todo = Todo(
            todoId = todoId,
            title = title,
            desc = desc,
            isComplete = isComplete,
            startDate = startDate,
            endDate = endDate
    )
}