package com.don.base.module_common

import com.blankj.utilcode.util.LogUtils

object Log {

    /**
     * 日志开关
     */
    fun setLogSwitch(logSwitch: Boolean) {
        LogUtils.getConfig().isLogSwitch = logSwitch
    }

    /**
     * 打印d级日志
     */
    fun d(vararg contents: Any?) {
        LogUtils.d(contents)
    }

    /**
     * 打印e级日志
     */
    fun e(vararg contents: Any?) {
        LogUtils.e(contents)
    }
}