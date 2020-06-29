package com.zh.baselib.presenter.view

/**
 * create by zj on 2020/6/29
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(error: String)
}