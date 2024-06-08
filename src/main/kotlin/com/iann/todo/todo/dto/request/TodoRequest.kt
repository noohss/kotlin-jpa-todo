package com.iann.todo.todo.dto.request

import com.iann.todo.todo.entity.Todo
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import lombok.Builder
import java.sql.Date
import java.sql.Timestamp
import java.time.LocalDateTime

data class TodoRequest(
    val id: Long? = null,

    @NotBlank
    @Size(min = 0, max = 20)
    val title: String,

    @Size(min = 0, max = 200)
    val desc: String,
    val isComplete: Boolean = false,
) {

    fun toEntity(): Todo = Todo(
            id = id,
            title = title,
            desc = desc,
            isComplete = isComplete,
    )
}