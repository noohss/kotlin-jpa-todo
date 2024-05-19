package com.iann.todo.repository

import com.iann.todo.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository: JpaRepository<Todo, Long> {
}