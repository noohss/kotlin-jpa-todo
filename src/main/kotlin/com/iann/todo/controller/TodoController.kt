package com.iann.todo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {

    @GetMapping("/")
    fun hello(): String {
        return "hello"
    }
}