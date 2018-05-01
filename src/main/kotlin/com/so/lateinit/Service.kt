package com.so.lateinit

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.stereotype.Service

@Service
class Service {
    @Autowired
    lateinit var env: Environment

    fun doStuff() = env.activeProfiles
}