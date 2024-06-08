package com.iann.todo.auth.entity

import com.iann.todo.global.constant.ROLE
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id

@Entity
class Member (
    @Id
    val id: Long,
    var nickname: String,
    var email: String,
    @Enumerated(EnumType.STRING)
    var role: ROLE
        ){

}