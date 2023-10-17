package com.example.publishertest.service

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class Main(
    private val eventPublisher: EventPublisher
) {

    @Scheduled(fixedRate = 5000)
    fun send(){
        for (i in 0..100){
            eventPublisher.publish("hohoho", "number $i went to swim")
        }

    }
}