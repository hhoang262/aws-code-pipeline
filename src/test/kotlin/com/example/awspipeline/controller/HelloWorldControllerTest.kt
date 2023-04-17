package com.example.awspipeline.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
class HelloWorldControllerTest(
    @Autowired val mockMvc: MockMvc
) {

    @Test
    fun whenGetRequestHelloWorld_thenReturnsStatus200() {
        mockMvc.perform(get("/hello-world"))
            .andExpect(status().isOk)
    }
}