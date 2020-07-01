package com.zh.user.ui.activity

import android.os.Bundle
import android.widget.Toast
import com.zh.baselib.net.RetrofitUtils
import com.zh.baselib.ui.activity.BaseMvpActivity
import com.zh.user.R
import com.zh.user.presenter.RegisterPresenter
import com.zh.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        btn_register.setOnClickListener() {
            mPresenter.onRegister(
                applicationContext,
                edit_phone.text.toString(),
                edit_pwd.text.toString(),
                edit_pwd_confirm.text.toString(),
                edit_captcha.text.toString()
            )
        }

    }

    override fun onRegisterSuccess(result: Boolean) {
        Toast.makeText(applicationContext, "注册成功", Toast.LENGTH_SHORT).show()
    }

    override fun onError(error: String) {
        Toast.makeText(applicationContext, error, Toast.LENGTH_SHORT).show()
    }
}
