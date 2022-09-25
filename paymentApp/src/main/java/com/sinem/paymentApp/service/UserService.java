package com.sinem.paymentApp.service;

import com.sinem.paymentApp.repository.UserRepository;
import com.sinem.paymentApp.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService{
    private final UserRepository userRepository;
   public User save(User user){
        return userRepository.save(user);
    }
    public List<User> findAll(){
       return  userRepository.findAll();
    }

}
