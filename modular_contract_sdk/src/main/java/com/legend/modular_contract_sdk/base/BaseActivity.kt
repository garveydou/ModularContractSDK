package com.legend.modular_contract_sdk.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import java.lang.reflect.ParameterizedType


open abstract class BaseActivity<VM : BaseViewModel> : AppCompatActivity(){

    lateinit var mViewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = createViewModel()
        mViewModel.requestStateLiveData.observe(this, Observer{

        })
    }

    protected fun getViewModel() = mViewModel

    protected abstract fun createViewModel() : VM

}