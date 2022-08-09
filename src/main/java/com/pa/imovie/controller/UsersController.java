package com.pa.imovie.controller;


import com.pa.imovie.entity.Users;
import com.pa.imovie.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {


    @Autowired
    UsersService usersService;


    @PostMapping("register")
    @ResponseStatus(HttpStatus.CREATED)
    public String doRegister(@RequestBody Users users){
        return usersService.doRegister(users);

    }


    @PostMapping("login")
    public String doLogin(@RequestBody Users users){
        return usersService.doLogin(users);
    }


}
