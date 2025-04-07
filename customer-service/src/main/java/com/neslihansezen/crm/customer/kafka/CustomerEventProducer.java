package com.neslihansezen.crm.customer.kafka;

import com.neslihansezen.crm.customer.event.CustomerCreatedEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerEventProducer {
    private final KafkaTemplate<String, CustomerCreatedEvent> kafkaTemplate;

    public CustomerEventProducer(KafkaTemplate<String, CustomerCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(CustomerCreatedEvent event) {
        kafkaTemplate.send("customer-events", event.getCustomerId().toString(), event);
    }
}
