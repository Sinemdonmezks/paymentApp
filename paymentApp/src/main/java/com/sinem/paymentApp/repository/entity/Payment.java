package com.sinem.paymentApp.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int price;
    @OneToOne( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "home_id")
    Home home;


}