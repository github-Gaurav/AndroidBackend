package com.example.androidBackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AndroidBackendApplication

fun main(args: Array<String>) {
	runApplication<AndroidBackendApplication>(*args)
}
