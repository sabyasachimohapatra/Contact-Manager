package com.CM.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CM.repositories.UserRepo;

import com.CM.entities.User;

@Service
public class UserServices {


    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user) {
         try {
            return userRepo.save(user);
        } catch (Exception e) {

            e.printStackTrace();
            e.getMessage();
            return null;
    }

}
}