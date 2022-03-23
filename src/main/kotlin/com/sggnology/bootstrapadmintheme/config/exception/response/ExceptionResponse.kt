package com.sggnology.bootstrapadmintheme.config.exception.response

import com.sggnology.bootstrapadmintheme.config.exception.base.BaseHttpException

data class ExceptionResponse(
    val status: Int,
    val message: String
){
    companion object{
        fun <T: BaseHttpException>fromBaseHttpException(e: T) = ExceptionResponse(
            status = e.status.value(),
            message = e.message ?: e.toString()
        )
    }
}
