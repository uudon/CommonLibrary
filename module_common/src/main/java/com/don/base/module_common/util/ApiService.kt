package com.don.base.module_common.util

import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * 创建请求client
 */
private fun createApiService() {
    val okHttpClient = OkHttpClient.Builder()
    Retrofit.Builder().client(okHttpClient.build())
}