package com.legend.modular_contract_sdk.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.legend.modular_contract_sdk.component.net.LoadState
import kotlinx.coroutines.*

open class BaseViewModel : ViewModel() {


    var requestStateLiveData : MutableLiveData<LoadState> = MutableLiveData()

    fun request(requestBlock: suspend () -> Unit) {
        viewModelScope.launch(CoroutineExceptionHandler { coroutineContext, throwable ->
            onError(throwable.message?:"No Message")
        }) {
            onStartLoading()
            withContext(Dispatchers.IO){
                requestBlock()
            }
            onComplete()
        }
    }

    fun onStartLoading(){
        requestStateLiveData.value = LoadState.StartLoading()
    }

    fun onError(msg: String) {
        requestStateLiveData.value = LoadState.Fail(msg)
    }

    fun onComplete(){
        requestStateLiveData.value = LoadState.Complete()
    }

}