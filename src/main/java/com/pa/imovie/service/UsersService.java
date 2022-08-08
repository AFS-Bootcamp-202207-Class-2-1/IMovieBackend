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
        String usersName = users.getUsers_name();
        String password = users.getUsers_password();
        Users user = usersRepository.findUsersByUsers_nameAndUsers_password(usersName,password);
        String msg = "";
        if (user == null){
            usersRepository.save(users);
            msg = "registered successfully";
            return msg;
        }
        msg = "the user alrealy exists";
        return msg;
    }
}
