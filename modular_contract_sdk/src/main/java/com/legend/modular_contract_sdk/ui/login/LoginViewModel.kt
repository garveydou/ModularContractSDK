package com.legend.modular_contract_sdk.ui.login

import androidx.lifecycle.MutableLiveData
import com.legend.modular_contract_sdk.base.BaseViewModel
import com.legend.modular_contract_sdk.component.net.RetrofitInstance

import com.legend.modular_contract_sdk.repository.model.LoginInfo
import com.legend.modular_contract_sdk.repository.setvices.UserServices
import com.orhanobut.logger.Logger

class LoginViewModel : BaseViewModel() {

    val loginInfoLiveData = MutableLiveData<LoginInfo>()

    fun login(userName: String, pwd: String){
        request {
            Logger.e("request login")
            RetrofitInstance.create(UserServices::class.java)
                .login(userName, pwd)
                .apply {
                    loginInfoLiveData.postValue(this.data)
                }
        }
    }

}