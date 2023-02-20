package com.example.awspipeline

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwsPipelineApplication

fun main(args: Array<String>) {
    runApplication<AwsPipelineApplication>(*args)
}

fun test(){
   print("1")
}
