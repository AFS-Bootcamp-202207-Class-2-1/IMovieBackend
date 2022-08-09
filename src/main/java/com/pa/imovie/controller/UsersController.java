package com.pa.imovie.controller;


import com.pa.imovie.entity.Users;
import com.pa.imovie.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {


    @Autowired
    UsersService usersService;


    @PostMapping("register")
    public String doRegister(@RequestBody Users users){

        return usersService.doRegister(users);

    }

//    @PostMapping("login")
//    public String doLogin(@PathVariable String users_name,@PathVariable String users_password){
//
//        return usersService.doLogin(users_name,users_password);
//    }


}
