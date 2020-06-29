package com.zh.baselib.presenter

import com.zh.baselib.presenter.view.BaseView

/**
 * create by zj on 2020/6/29
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}