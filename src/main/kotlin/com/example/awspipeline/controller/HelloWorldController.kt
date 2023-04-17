package com.example.awspipeline.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello-world")
    fun helloWorld(
    ): ResponseEntity<Unit> {
        return ResponseEntity.ok(Unit)
    }
}