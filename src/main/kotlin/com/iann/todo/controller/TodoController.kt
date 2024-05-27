package com.iann.todo.controller

import com.iann.todo.dto.request.TodoRequest
import com.iann.todo.dto.response.ApiResponse
import com.iann.todo.exception.ResultCode
import com.iann.todo.service.TodoService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@Tag(name = "todo API")
@RestController
@RequestMapping("/api/v1/todo")
class TodoController (
        private val todoService: TodoService
){

    @PostMapping("")
    fun save(@RequestBody req: TodoRequest): ApiResponse<Any> {
        return ApiResponse.success(todoService.save(req))
    }

    @GetMapping("")
    fun findList(): ApiResponse<Any> {
        return ApiResponse.success(todoService.findList())
    }

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long): ApiResponse<Any>{
        return ApiResponse.success(todoService.findOne(id))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ApiResponse<Any> {
        return ApiResponse.success(todoService.delete(id))
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody req: TodoRequest): ApiResponse<Any> {
        return ApiResponse.success(todoService.update(id, req))
    }
}