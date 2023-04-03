package com.don.base.library

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import okhttp3.OkHttpClient
import okhttp3.Request
import kotlin.concurrent.thread

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)

        val button = findViewById<Button>(R.id.request_button)
        val content = findViewById<TextView>(R.id.contentTextView)
        button.setOnClickListener {
            thread {
                val result = request("https://raw.github.com/square/okhttp/master/README.md")
                runOnUiThread {
                    content.text = result
                }
            }
        }
    }

    private fun request(url: String): String? {
        val client = OkHttpClient()
        val call = Request.Builder().url(url).build()
        val response = client.newCall(call).execute()
        return response.body?.string()
    }
}