package com.example.publishertest.config

import org.springframework.context.annotation.Configuration


@Configuration
class KafkaProducerConfig {

    val topic: String = "hohoho"
    val sendingTimeoutMs: Long = 5000
}