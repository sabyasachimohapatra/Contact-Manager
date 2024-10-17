package com.CM.repositories;

import java.lang.foreign.Linker.Option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CM.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User,String> {


    User findByEmail(String email);
    
} 