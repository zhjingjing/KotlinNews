package com.zh.baselib.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zh.baselib.common.AppManager

/**
 * create by zj on 2020/6/29
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppManager.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppManager.removeActivity(this)
    }
}