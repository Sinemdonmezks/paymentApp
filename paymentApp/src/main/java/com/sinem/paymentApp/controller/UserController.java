package com.sinem.paymentApp.controller;

import com.sinem.paymentApp.repository.entity.User;
import com.sinem.paymentApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @GetMapping("/save")
    public ResponseEntity<User> save(String name, String surname, String address,
                                     String phonenumber, String email, String password){
        User user =userService.save(User.builder()
                .name(name)
                .surname(surname)
                .address(address)
                .phonenumber(phonenumber)
                .email(email)
                .password(password)
                .build());
        return ResponseEntity.ok(user);
    }

    @GetMapping("/findall")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

}
