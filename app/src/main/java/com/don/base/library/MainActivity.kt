package com.don.base.library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.don.base.module_common.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Log.setLogSwitch(true)
        Log.d("我是笨蛋")
    }
}