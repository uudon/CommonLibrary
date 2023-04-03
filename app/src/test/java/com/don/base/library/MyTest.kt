package com.don.base.library

import junit.framework.TestCase.assertEquals
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test

class MyTest {

    private lateinit var server: MockWebServer

    @Before
    fun setUp() {
        server = MockWebServer()
        server.start()
    }

    @After
    fun tearDown() {
        server.shutdown()
    }

    @Test
    fun testServerResponse() {
        val expectedResponse = "Hello, World!"
        server.enqueue(MockResponse().setBody(expectedResponse))

        val client = OkHttpClient()

        val request = Request.Builder()
            .url(server.url("/"))
            .build()

        val response = client.newCall(request).execute()

        assertEquals(expectedResponse, response.body?.string())
    }


}