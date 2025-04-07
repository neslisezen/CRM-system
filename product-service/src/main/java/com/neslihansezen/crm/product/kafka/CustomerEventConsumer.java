package com.neslihansezen.crm.product.kafka;

import event.CustomerCreatedEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerEventConsumer {
    @KafkaListener(topics = "customer-created", groupId = "product")
    public void listen(CustomerCreatedEvent event) {
        System.out.println("Received customer: " + event.getCustomerId() + " - " + event.getCustomerName() + " - " + event.getProductIds());
    }
}
