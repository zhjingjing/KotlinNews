package com.zh.baselib.common

import android.content.Context
import android.widget.Toast

/**
 * create by zj on 2020/6/29
 */
fun Context.shortToast(context: Context, content: String) {
    Toast.makeText(context, content, Toast.LENGTH_SHORT).show()
}