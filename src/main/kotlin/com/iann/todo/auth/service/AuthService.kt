package com.iann.todo.auth.service

import com.iann.todo.auth.entity.Member
import com.iann.todo.auth.repository.MemberRepository
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest
import org.springframework.security.oauth2.core.OAuth2AuthenticationException
import org.springframework.security.oauth2.core.user.DefaultOAuth2User
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Service
import java.util.*


@Service
class AuthService(
    private val memberRepository: MemberRepository
): DefaultOAuth2UserService() {

}