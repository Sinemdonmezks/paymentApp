package com.sinem.paymentApp.controller;

import com.sinem.paymentApp.repository.entity.Payment;
import com.sinem.paymentApp.repository.entity.User;
import com.sinem.paymentApp.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("payment")
public class PaymentController {

    private final PaymentService paymentService;
    @GetMapping("/save")
    public ResponseEntity<Payment> save(int price){
        Payment payment=paymentService.save(Payment.builder()
                        .price(price)
                        .build());
    return ResponseEntity.ok(payment);
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Payment>> findAll() {
        return ResponseEntity.ok(paymentService.findAll());
    }

}
