package com.iann.todo.exception

class BaseException(val resultCode: ResultCode): RuntimeException(resultCode.message) {
}