package com.zh.baselib.data

/**
 * create by zj on 2020/6/30
 */
data class BaseData<T>(val status: Int, val message: String, val data: T) {
}