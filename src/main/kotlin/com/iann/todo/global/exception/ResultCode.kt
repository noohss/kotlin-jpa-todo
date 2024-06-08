package com.iann.todo.global.exception

import org.springframework.http.HttpStatus

enum class ResultCode(
        val status: Int,
        val message: String
) {
    TODO_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "일정을 찾을 수 없습니다."),
    FAILED_TO_SAVE_TODO(HttpStatus.NOT_FOUND.value(), "일정 등록에 실패했습니다."),

    USER_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "가입된 회원이 아닙니다."),

    SUCCESS(HttpStatus.OK.value(), "정상처리 되었습니다.")
}