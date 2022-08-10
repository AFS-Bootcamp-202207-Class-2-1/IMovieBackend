package com.pa.imovie.service;

import com.pa.imovie.entity.Users;
import com.pa.imovie.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

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

    public Map doLogin(Users users) {
        Map<String, String> map = new HashMap<>();
        String users_name = users.getUsersName();
        String users_password = users.getUsersPassword();
        Users findUser = usersRepository.findUsersByUsernameAndPassword(users_name, users_password);
        if (findUser == null) {
            map.put("userName", null);
            map.put("userGender", null);
            map.put("msg", "the username and password are inconsistent");
            return map;
        }
        map.put("username", findUser.getUsersName());
        map.put("userGender", findUser.getUsersGender());
        map.put("msg", "login successfully");
        return map;

    }


}
