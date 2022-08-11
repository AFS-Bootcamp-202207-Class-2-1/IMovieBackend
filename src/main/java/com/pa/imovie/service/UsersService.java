package com.pa.imovie.service;

import cn.dev33.satoken.stp.StpUtil;
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
        String msg = "";
        if (user == null){
            usersRepository.save(users);
            msg = "registered successfully";
            return msg;
        }
        msg = "the user already exists";
        return msg;
    }

    public Map<String,String> doLogin(Users users) {
        Map<String,String> map = new HashMap<>();
        String users_name = users.getUsersName();
        String users_password = users.getUsersPassword();


        Users findUser = usersRepository.findUsersByUsernameAndPassword(users_name,users_password);
        if (findUser == null) {
            map.put("msg","the username and password are inconsistent");
            map.put("userName","");
            map.put("userGender","");
            map.put("userId","");
            return map;
        }
        String userId = String.valueOf(findUser.getUsersId());
        StpUtil.login(users_name);
        map.put("msg","login successfully");
        map.put("userId",userId);
        map.put("userName",StpUtil.getLoginIdAsString());
        map.put("userGender",findUser.getUsersGender());
        return map;

    }
}
