package com.sggnology.bootstrapadmintheme.config.security

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.password.PasswordEncoder

@EnableWebSecurity
class WebSecurity(
    private val passwordEncoder: PasswordEncoder
) : WebSecurityConfigurerAdapter() {
    override fun configure(web: WebSecurity) {
        web
            .ignoring()
            .antMatchers(
                "/favicon.ico"
            )
    }

    override fun configure(http: HttpSecurity) {

        http.csrf().disable()

        http
            .authorizeRequests()
            .anyRequest().hasRole("ADMIN")

        http
            .formLogin()
//            .loginPage("/login")
            .defaultSuccessUrl("/")
            .permitAll()

        http
            .logout()
            .logoutUrl("/logout")
            .logoutSuccessUrl("/login")
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        super.configure(auth)
    }


}