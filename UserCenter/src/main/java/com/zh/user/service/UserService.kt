package com.zh.user.service

import io.reactivex.rxjava3.core.Observable


/**
 * create by zj on 2020/6/29
 */
interface UserService {
    fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean>
}