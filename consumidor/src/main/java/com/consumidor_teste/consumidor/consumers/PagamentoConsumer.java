package com.consumidor_teste.consumidor.consumers;

import java.util.Map;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.consumidor_teste.consumidor.model.PagamentoModel;

/**
 * PagamentoConsumer
 */
@Component
public class PagamentoConsumer {

    @KafkaListener(topics = "topic1", groupId = "pagamentos-id")
    public void listen(@Payload PagamentoModel object) {
        System.out.println(object);
    }
    
}