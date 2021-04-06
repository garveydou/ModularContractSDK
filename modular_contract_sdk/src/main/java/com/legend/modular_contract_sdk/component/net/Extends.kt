package com.legend.modular_contract_sdk.component.net

sealed class LoadState(val msg: String) {
    class StartLoading(msg: String = "") : LoadState(msg)
    class Success(msg: String = "") : LoadState(msg)
    class Fail(msg: String) : LoadState(msg)
    class Complete(msg: String  = "") : LoadState(msg)
}
