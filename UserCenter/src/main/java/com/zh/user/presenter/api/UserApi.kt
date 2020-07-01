package com.zh.user.presenter.api

import com.zh.baselib.data.BaseData
import com.zh.user.data.RegisterResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * create by zj on 2020/6/30
 */
interface UserApi {
    @POST
    fun doRegister(@Body res: RegisterResponse): Observable<BaseData<String>>
}