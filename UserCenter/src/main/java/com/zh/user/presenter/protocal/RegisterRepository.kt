package com.zh.user.presenter.protocal

import com.zh.baselib.data.BaseData
import com.zh.baselib.net.RetrofitUtils
import com.zh.user.data.RegisterResponse
import com.zh.user.presenter.api.UserApi
import io.reactivex.rxjava3.core.Observable

/**
 * create by zj on 2020/6/30
 */
class RegisterRepository {
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseData<String>> {
        return RetrofitUtils.instances.create(UserApi::class.java)
            .doRegister(RegisterResponse(mobile, pwd, verifyCode))
    }
}