package com.iann.todo.exception

import com.iann.todo.dto.response.ApiResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(BaseException::class)
    fun handleCustomException(ex: BaseException): ResponseEntity<ApiResponse<Any>> {
        val response = ApiResponse<Any>(
                status = ex.resultCode.status,
                message = ex.resultCode.message
        )
        return ResponseEntity(response, HttpStatus.valueOf(ex.resultCode.status))
    }
}