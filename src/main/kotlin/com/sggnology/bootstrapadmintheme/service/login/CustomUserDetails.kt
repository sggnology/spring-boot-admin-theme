package com.sggnology.bootstrapadmintheme.service.login

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

class CustomUserDetails(
    val pw: String
): UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        val grantList = mutableListOf<GrantedAuthority>()
        grantList.add(SimpleGrantedAuthority("ROLE_ADMIN"))
        return grantList
    }

    override fun getPassword(): String {
        return pw
    }

    override fun getUsername(): String {
        return "admin"
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}