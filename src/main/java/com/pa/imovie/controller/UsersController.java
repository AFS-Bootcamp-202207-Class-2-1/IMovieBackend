package com.pa.imovie.controller;


import com.pa.imovie.entity.Users;
import com.pa.imovie.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
//@CrossOrigin(origins = "*")
public class UsersController {
    @Autowired
    UsersService usersService;


    @PostMapping("register")
    @ResponseStatus(HttpStatus.CREATED)
    public String doRegister(@RequestBody Users users){
        return usersService.doRegister(users);

    }


    @PostMapping("login")
    public Map doLogin(@RequestBody Users users){
        return usersService.doLogin(users);
    }


}
