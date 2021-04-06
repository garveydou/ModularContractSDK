package com.legend.modularcontractsdk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.legend.modular_contract_sdk.ModularContractSDK

import com.legend.modular_contract_sdk.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ModularContractSDK.initSDK(this)
        findViewById<Button>(R.id.btn_start).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}