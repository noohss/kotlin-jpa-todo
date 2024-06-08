package com.iann.todo.todo.dto.response

import com.iann.todo.global.exception.ResultCode

data class ApiResponse<Any>(
        val status: Int,
        val message: String,
        val data: Any? = null
) {
    companion object {
        fun <Any> success(data: Any?): ApiResponse<Any> {
            return ApiResponse(ResultCode.SUCCESS.status, ResultCode.SUCCESS.message, data)
        }
    }
}
