package com.legend.modular_contract_sdk.component.net

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val baseUrl = "https://pms.hanmiit.cn/"

object RetrofitInstance {
    private val retrofitClient: Retrofit
        get() {
            val httpClient = OkHttpClient.Builder().retryOnConnectionFailure(true)
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build()

            return Retrofit.Builder().client(httpClient).baseUrl(baseUrl).addConverterFactory(
                GsonConverterFactory.create()).build()
        }


    fun <T> create(service: Class<T>): T {
        return retrofitClient.create(service)
    }

}