package com.example.demo.Services;

import com.example.demo.Configs.MyUserDetailsService;
import com.example.demo.Enteties.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    MyUserDetailsService myUserDetailsService;

    public User register(User user) {
        return myUserDetailsService.addUser(user);
    }
}
