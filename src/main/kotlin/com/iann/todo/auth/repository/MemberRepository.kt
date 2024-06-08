package com.iann.todo.auth.repository

import com.iann.todo.auth.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository: JpaRepository<Member, Long> {
}