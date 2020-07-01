package com.zh.baselib.common

import android.app.Activity
import java.util.*

/**
 * create by zj on 2020/6/30
 */
object AppManager {
    private val activityStack: Stack<Activity> = Stack()

    fun addActivity(activity: Activity) {
        activityStack.add(activity)
    }

    fun removeActivity(activity: Activity) {
        activity.finish()
        activityStack.remove(activity)
    }

    fun getTopActivity(): Activity {
        return activityStack.lastElement()
    }

    fun finishAll() {
        for (activity in activityStack) {
            activity.finish()
        }
        activityStack.clear()
    }
}