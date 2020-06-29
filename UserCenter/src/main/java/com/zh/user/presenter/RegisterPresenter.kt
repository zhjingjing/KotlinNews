package com.zh.user.presenter

import android.app.Application
import android.content.Context
import com.zh.baselib.common.shortToast
import com.zh.baselib.presenter.BasePresenter
import com.zh.baselib.rx.BaseObserver
import com.zh.user.presenter.view.RegisterView
import com.zh.user.service.impl.UserServiceImpl

/**
 * create by zj on 2020/6/29
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    fun onRegister(
        context: Context,
        mobile: String,
        pwd: String,
        pwdConfirm: String,
        verifyCode: String
    ) {
        if (mobile.isEmpty() || mobile == null) {
            context.shortToast(context, "请输入手机号")
            return
        }
        if (verifyCode.isEmpty() || verifyCode == null) {
            context.shortToast(context, "请输入验证码")
            return
        }
        if (pwd.isEmpty() || pwd == null) {
            context.shortToast(context, "请输入密码")
            return
        }
        if (pwdConfirm.isEmpty() || pwdConfirm == null || pwd != pwdConfirm) {
            context.shortToast(context, "请确认密码")
            return
        }
        val registerService = UserServiceImpl()
        registerService.register(mobile, verifyCode, pwd)
            .subscribe(object : BaseObserver<Boolean>() {
                override fun onNext(t: Boolean) {
                    super.onNext(t)
                    mView.onRegisterSuccess(t)
                }
            })
    }
}

