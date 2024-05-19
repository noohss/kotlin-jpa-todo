package com.iann.todo.dto.response

import com.iann.todo.exception.ResultCode

data class ApiResponse<Any>(
        val status: Int,
        val message: String,
        val data: Any? = null
) {
}