package com.microservices.producer.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservices.producer.domain.Invoice;
import com.microservices.producer.rabbit.Constants;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("ALL")
@RestController
public class ProducerApplicationController {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("/invoices")
    public ResponseEntity createInvoice(@RequestBody Invoice invoice) throws JsonProcessingException {
        rabbitTemplate.convertAndSend(Constants.INVOICE_QUEUE_NAME, objectMapper.writeValueAsBytes(invoice));
        return new ResponseEntity(invoice, HttpStatus.CREATED);
    }
}