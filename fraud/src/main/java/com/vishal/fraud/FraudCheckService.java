package com.vishal.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository repository;

    public Boolean isFraudulentCustomer(Integer CustomerId) {
        repository.save(FraudCheckHistory.builder()
                .customerId(CustomerId)
                .createdAt(LocalDateTime.now())
                .isFraudster(false)
                .build()
        );
        return false;
    }

}
