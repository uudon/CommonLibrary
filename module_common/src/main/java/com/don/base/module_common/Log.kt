package com.don.base.module_common

import com.blankj.utilcode.util.LogUtils

object Log {

    fun setLogSwitch(logSwitch: Boolean) {
        LogUtils.getConfig().isLogSwitch = logSwitch
    }

    fun d(vararg contents: Any?) {
        LogUtils.d(contents)
    }
}