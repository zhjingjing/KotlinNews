package com.zh.baselib.rx

import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

/**
 * create by zj on 2020/6/29
 */
open class BaseObserver<T> : Observer<T> {
    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable?) {
    }

    override fun onNext(t: T) {
    }

    override fun onError(e: Throwable?) {
    }
}