package com.zh.baselib.net

import android.util.Log
import com.zh.baselib.net.Constant.Companion.BaseUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * create by zj on 2020/6/30
 */
class RetrofitUtils private constructor() {
    companion object {
        val instances: RetrofitUtils by lazy { RetrofitUtils() }
    }

    private val retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder().baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create()).client(initClient()).build()
    }


    private fun initClient(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(getHeaderInterceptor())
            .addInterceptor(initLogInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS).build()
    }

    private fun initLogInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    private fun getHeaderInterceptor(): Interceptor {
        return Interceptor { chain ->
            Log.e("RetrofitUtils", "==========")
            val request = chain.request().newBuilder().addHeader("Content-Type", "application/json")
                .addHeader("chainSet", "utf-8").build()
            chain.proceed(request)
        }
    }

    fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }

}