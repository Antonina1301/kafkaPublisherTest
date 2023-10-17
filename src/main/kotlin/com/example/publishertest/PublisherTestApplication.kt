package com.example.publishertest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class PublisherTestApplication

fun main(args: Array<String>) {
	runApplication<PublisherTestApplication>(*args)
}
