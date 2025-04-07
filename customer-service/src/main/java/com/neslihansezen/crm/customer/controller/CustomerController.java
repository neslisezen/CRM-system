package com.neslihansezen.crm.customer.controller;

import com.neslihansezen.crm.customer.event.CustomerCreatedEvent;
import com.neslihansezen.crm.customer.kafka.CustomerEventProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerEventProducer customerEventProducer;

    public CustomerController(CustomerEventProducer customerEventProducer) {
        this.customerEventProducer = customerEventProducer;
    }

    // Endpoint to create a new customer
    @PostMapping
    public ResponseEntity<String> create(@RequestBody CustomerCreatedEvent customerCreatedEvent) {
        // Send the customer created event to Kafka
        customerEventProducer.sendEvent(customerCreatedEvent);

        // Return a response indicating success
        return ResponseEntity.ok("Customer created successfully");
    }
}
