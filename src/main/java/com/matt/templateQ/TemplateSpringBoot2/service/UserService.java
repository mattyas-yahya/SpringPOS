package com.matt.templateQ.TemplateSpringBoot2.service;

import com.matt.templateQ.TemplateSpringBoot2.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.matt.templateQ.TemplateSpringBoot2.model.User;
import org.springframework.context.annotation.Lazy;
 
@Lazy
@Service("userService")
public class UserService
{

    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository,BCryptPasswordEncoder bCryptPasswordEncoder)
    {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }



    public User findUserName(String name)
    {
        return userRepository.findByName(name);
    }

    public User saveUser(User user)
    {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        user.setRole("admin");
        return userRepository.save(user);
    }

}
