package com.sinem.paymentApp.service;

import com.sinem.paymentApp.repository.PaymentRepository;
import com.sinem.paymentApp.repository.entity.Payment;
import com.sinem.paymentApp.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {
   private final PaymentRepository paymentRepository;

   public Payment save(Payment payment){
       return paymentRepository.save(payment);
   }
    public List<Payment> findAll(){
        return  paymentRepository.findAll();
    }
}
