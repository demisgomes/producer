package com.microservices.producer.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;

@Component
public class QueueFactory {
    public Queue myQueue(){
        return new Queue(Constants.INVOICE_QUEUE_NAME, Constants.DURABLE);
    }
}
