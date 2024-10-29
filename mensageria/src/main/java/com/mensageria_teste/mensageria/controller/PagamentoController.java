package com.mensageria_teste.mensageria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("pagamento")
public class PagamentoController {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    
    @PostMapping
    public void criarPagamento(@RequestBody Map<String, Object> map) {
        kafkaTemplate.send("topic1", map);
    }
    

}
