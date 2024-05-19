package com.iann.todo.dto.request

import com.iann.todo.entity.Todo
import lombok.Builder
import java.sql.Date

data class TodoRequest(
    val todoId: Long? = null,
    val title: String,
    val desc: String,
    val status: String = "진행중",
    val startDate: Date,
    val endDate: Date
) {

    fun toEntity(): Todo = Todo(
            todoId = todoId,
            title = title,
            desc = desc,
            status = status,
            startDate = startDate,
            endDate = endDate
    )
}