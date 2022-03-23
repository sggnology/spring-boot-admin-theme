package com.sggnology.bootstrapadmintheme.config.exception.base

import com.sggnology.bootstrapadmintheme.config.exception.response.ExceptionResponse
import org.springframework.http.HttpStatus

abstract class BaseHttpException(
    message: String
): RuntimeException(message) {
    abstract val status: HttpStatus
    fun toExceptionResponse() = ExceptionResponse.fromBaseHttpException(this)
}