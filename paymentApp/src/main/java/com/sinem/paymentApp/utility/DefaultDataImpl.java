package com.sinem.paymentApp.utility;

import com.sinem.paymentApp.repository.UserRepository;
import com.sinem.paymentApp.repository.entity.Home;
import com.sinem.paymentApp.repository.entity.Payment;
import com.sinem.paymentApp.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class DefaultDataImpl {
    private final UserRepository userRepository;

    @PostConstruct

    private void saveUser(){
        User user1= User.builder()
                .name("Aslı")
                .surname("Kaya")
                .address("Bursa")
                .phonenumber("0555-444-55-55")
                .email("aslı.@gmail.com")
                .password("2345")
                .home(Home.builder()
                        .sitename("Dönmez sitesi")
                        .apartmentnumber(1)
                        .build())
                .payment(Payment.builder()
                        .price(250)
                        .build())
                .build();
        User user2= User.builder()
                .name("Sinem")
                .surname("Dönmez")
                .address("Bursa")
                .phonenumber("0555-555-55-55")
                .email("snm.@gmail.com")
                .password("1234")
                .home(Home.builder()
                        .sitename("Dönmez sitesi")
                        .apartmentnumber(2)
                        .build())
                .payment(Payment.builder()
                        .price(250)
                        .build())
                .build();
        User user3= User.builder()
                .name("Kerim")
                .surname("Alıç")
                .address("Bursa")
                .phonenumber("0333-555-55-55")
                .email("kerim.@gmail.com")
                .password("1357")
                .home(Home.builder()
                        .sitename("Dönmez sitesi")
                        .apartmentnumber(3)
                        .build())
                .payment(Payment.builder()
                        .price(250)
                        .build())
                .build();
        User user4= User.builder()
                .name("Kemal")
                .surname("Ak")
                .address("Bursa")
                .phonenumber("0555-222-55-22")
                .email("kemal.@gmail.com")
                .password("1236")
                .home(Home.builder()
                        .sitename("Dönmez sitesi")
                        .apartmentnumber(4)
                        .build())
                .payment(Payment.builder()
                        .price(250)
                        .build())
                .build();
        User user5= User.builder()
                .name("Ayla")
                .surname("Başar")
                .address("Bursa")
                .phonenumber("0777-555-55-55")
                .email("ayla.@gmail.com")
                .password("9876")
                .home(Home.builder()
                        .sitename("Dönmez sitesi")
                        .apartmentnumber(5)
                        .build())
                .payment(Payment.builder()
                        .price(250)
                        .build())
                .build();
        User user6= User.builder()
                .name("Ela")
                .surname("Özdemir")
                .address("Bursa")
                .phonenumber("0111-555-11-11")
                .email("ela.@gmail.com")
                .password("0000")
                .home(Home.builder()
                        .sitename("Dönmez sitesi")
                        .apartmentnumber(6)
                        .build())
                .payment(Payment.builder()
                        .price(250)
                        .build())
                .build();

        userRepository.saveAll(Arrays.asList(user1,user2,user3,user4,user5,user6));

    }

}
