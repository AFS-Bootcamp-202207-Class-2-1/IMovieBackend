package com.pa.imovie.service;

import com.pa.imovie.entity.Users;
import com.pa.imovie.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
   UsersRepository usersRepository;


    public String doRegister(Users users){
        String usersName = users.getUsersName();
        Users user = usersRepository.findByUsername(usersName);
        if (user == null){
            usersRepository.save(users);
            return "registered successfully";
        }
        return "the user already exists";
    }

    public String doLogin(Users users) {
        String users_name = users.getUsersName();
        String users_password = users.getUsersPassword();
        Users findUser = usersRepository.findUsersByUsernameAndPassword(users_name,users_password);
        if (findUser == null){
            return "the username and password are inconsistent";
        }
        return "login successfully";
    }
}
