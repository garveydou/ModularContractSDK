package com.legend.modular_contract_sdk.ui.login

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.legend.modular_contract_sdk.base.BaseActivity
import com.legend.modular_contract_sdk.R
import com.legend.modular_contract_sdk.databinding.ActivityLoginBinding
import com.legend.modular_contract_sdk.repository.model.LoginInfo
import com.legend.modular_contract_sdk.utils.JsonUtil
import com.orhanobut.logger.Logger

class LoginActivity : BaseActivity<LoginViewModel>(){


    lateinit var mBinding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        mBinding.btnLogin.setOnClickListener {
            Logger.e("click")
            getViewModel().login("445489353@qq.com","123456")
        }

        getViewModel().loginInfoLiveData.observe(this, Observer<LoginInfo>{
            mBinding.tvInfo.text = JsonUtil.toJson(it)
        })
    }

    override fun createViewModel() = ViewModelProvider(this).get(LoginViewModel::class.java)

}