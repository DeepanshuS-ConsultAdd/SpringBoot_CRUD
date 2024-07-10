package com.example.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.website.model.MyUser;
import com.example.website.model.MyUserRepository;


@RestController
public class RegistrationController {

    @Autowired
    private MyUserRepository myUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register/user")
    public MyUser creatUser(@RequestBody MyUser user)
    {
        System.out.println(user);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return myUserRepository.save(user);
    }


}
