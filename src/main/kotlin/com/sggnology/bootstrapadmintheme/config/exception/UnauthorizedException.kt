package com.sggnology.bootstrapadmintheme.config.exception

import com.sggnology.bootstrapadmintheme.config.exception.base.BaseHttpException
import org.springframework.http.HttpStatus

class UnauthorizedException(var msg: String): BaseHttpException(msg) {
    override val status: HttpStatus = HttpStatus.UNAUTHORIZED
}