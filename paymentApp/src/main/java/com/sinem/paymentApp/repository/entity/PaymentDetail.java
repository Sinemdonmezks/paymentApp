package com.sinem.paymentApp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDetail {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String apartmentnumber;
    String paymenttype;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
            @JoinColumn(name = "payment_id")
    Payment payment;
}
