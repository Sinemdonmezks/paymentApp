package com.sinem.paymentApp.service;

import com.sinem.paymentApp.repository.HomeRepository;
import com.sinem.paymentApp.repository.entity.Home;
import com.sinem.paymentApp.repository.entity.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {
    private final HomeRepository homeRepository;
    public Home save(Home home){
        return homeRepository.save(home);
    }
    public List<Home> findAll(){
        return  homeRepository.findAll();
    }

}
