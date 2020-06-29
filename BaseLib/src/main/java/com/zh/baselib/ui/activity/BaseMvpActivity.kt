package com.zh.baselib.ui.activity

import android.widget.Toast
import com.zh.baselib.presenter.BasePresenter
import com.zh.baselib.presenter.view.BaseView

/**
 * create by zj on 2020/6/29
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    lateinit var mPresenter: T
    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }

    override fun onError(error: String) {
    }

}