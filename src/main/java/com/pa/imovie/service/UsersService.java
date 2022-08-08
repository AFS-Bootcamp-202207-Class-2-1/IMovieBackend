package com.pa.imovie.service;

import com.pa.imovie.entity.Users;
import com.pa.imovie.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    public Users add(Users users) {
        return usersRepository.save(users);
    }

    public Users findUserByUsername(String users_name){
        return usersRepository.findByUsers_name(users_name);
    }
}
