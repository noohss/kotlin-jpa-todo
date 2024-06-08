package com.iann.todo.todo.repository

import com.iann.todo.todo.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository: JpaRepository<Todo, Long> {
}