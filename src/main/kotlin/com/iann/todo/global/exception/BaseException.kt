package com.iann.todo.global.exception

class BaseException(val resultCode: ResultCode): RuntimeException(resultCode.message) {
}