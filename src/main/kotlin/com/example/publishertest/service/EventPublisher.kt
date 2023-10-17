package com.example.publishertest.service

import com.example.publishertest.config.KafkaProducerConfig
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.clients.producer.RecordMetadata
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

@Service
class EventPublisher(
    private val kafkaTemplate: KafkaTemplate<String, String>,
    private val config: KafkaProducerConfig
) {

    fun publish(topic: String, message: String) {
        try {
            kafkaTemplate.send(
                config.topic, topic, message
            ).get(config.sendingTimeoutMs, TimeUnit.MILLISECONDS)
        } catch (e: Exception) {
            throw Exception("Не удалось опубликовать событие")
        }
    }
}