package com.zh.user.service.impl

import com.zh.user.service.UserService
import io.reactivex.rxjava3.core.Observable

/**
 * create by zj on 2020/6/29
 */
class UserServiceImpl : UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }
}