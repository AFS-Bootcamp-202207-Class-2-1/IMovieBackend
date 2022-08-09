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
        String msg = "";
        if (user == null){
            usersRepository.save(users);
            msg = "registered successfully";
            return msg;
        }
        msg = "the user alrealy exists";
        return msg;
    }

    public String doLogin(Users users) {
        String users_name = users.getUsersName();
        String users_password = users.getUsersPassword();
        Users findUser = usersRepository.findUsersByUsernameAndPassword(users_name,users_password);
        String msg = "";
        if (findUser == null){
            msg = "the username and password are inconsistent";
            return msg;
        }
        msg = "login successfully";
        return msg;
    }
}
