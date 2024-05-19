package com.iann.todo.controller

import com.iann.todo.dto.request.TodoRequest
import com.iann.todo.dto.response.ApiResponse
import com.iann.todo.exception.ResultCode
import com.iann.todo.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
class TodoController (
        private val todoService: TodoService
){

    @PostMapping("/save")
    fun save(req: TodoRequest): ApiResponse<Any> {
        return ApiResponse(ResultCode.SUCCESS.status, ResultCode.SUCCESS.message, todoService.save(req))
    }

    @GetMapping("/todoList")
    fun findList(): ApiResponse<Any> {
        return ApiResponse(ResultCode.SUCCESS.status, ResultCode.SUCCESS.message, todoService.findList())
    }

    @GetMapping("/todo/{id}")
    fun findOne(@PathVariable id: Long): ApiResponse<Any>{
        return ApiResponse(ResultCode.SUCCESS.status, ResultCode.SUCCESS.message, todoService.findOne(id))
    }

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long): ApiResponse<Any> {
        return ApiResponse(ResultCode.SUCCESS.status, ResultCode.SUCCESS.message, todoService.delete(id))
    }

    @PutMapping("/update/{id}")
    fun update(@PathVariable id: Long, req: TodoRequest): ApiResponse<Any> {
        return ApiResponse(ResultCode.SUCCESS.status, ResultCode.SUCCESS.message, todoService.update(id, req))
    }
}