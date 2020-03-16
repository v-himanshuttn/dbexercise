package com.example.practicesboot2.repositories;

import com.example.practicesboot2.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
