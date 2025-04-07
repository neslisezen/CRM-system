package com.neslihansezen.crm.customer.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCreatedEvent {
    private Long customerId;
    private String customerName;
    private List<Long> productIds;
    private List<Integer> productQuantities;
}
