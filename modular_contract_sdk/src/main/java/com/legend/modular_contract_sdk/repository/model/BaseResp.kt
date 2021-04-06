package com.legend.modular_contract_sdk.repository.model

class BaseResp<T> {
    val code = 0
    val msg: String? = null
    val data: T? = null

    fun ok(): Boolean {
        return code == 9000
    }

}