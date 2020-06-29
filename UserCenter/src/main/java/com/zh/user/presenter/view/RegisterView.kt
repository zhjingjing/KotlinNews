package com.zh.user.presenter.view

import com.zh.baselib.presenter.view.BaseView

/**
 * create by zj on 2020/6/29
 */
interface RegisterView : BaseView {
    fun onRegisterSuccess(result: Boolean)
}