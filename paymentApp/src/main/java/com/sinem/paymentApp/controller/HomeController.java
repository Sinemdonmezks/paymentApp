package com.sinem.paymentApp.controller;

import com.sinem.paymentApp.repository.entity.Home;
import com.sinem.paymentApp.repository.entity.User;
import com.sinem.paymentApp.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {
    private final HomeService homeService;

    @GetMapping("/save")
    public ResponseEntity<Home> save(String sitename,int apartmentnumber){
        Home home=homeService.save(Home.builder()
                        .sitename(sitename)
                        .apartmentnumber(apartmentnumber)
                .build());
        return ResponseEntity.ok(home);
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Home>> findAll() {
        return ResponseEntity.ok(homeService.findAll());
    }

}
