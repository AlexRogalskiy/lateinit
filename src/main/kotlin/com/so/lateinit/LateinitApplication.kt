package com.so.lateinit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LateinitApplication

fun main(args: Array<String>) {
    runApplication<LateinitApplication>(*args)
}
