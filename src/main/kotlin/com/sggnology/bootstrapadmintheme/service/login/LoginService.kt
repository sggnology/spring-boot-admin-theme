package com.sggnology.bootstrapadmintheme.service.login

import com.sggnology.bootstrapadmintheme.config.exception.UnauthorizedException
import com.sggnology.bootstrapadmintheme.define.error.HttpErrorMsg
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class LoginService(
    private val passwordEncoder: PasswordEncoder
) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        if(username == "admin"){
            return CustomUserDetails(passwordEncoder.encode("1234"))
        }
        else{
            throw UnauthorizedException(HttpErrorMsg.UNAUTHORIZED)
        }
    }
}