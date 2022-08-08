package com.pa.imovie.controller;


import com.pa.imovie.entity.Users;
import com.pa.imovie.service.UsersService;
import com.sun.deploy.net.MessageHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String register(@RequestBody Users users){
        String usersName = users.getUsers_name();
        Users findUser = usersService.findUserByUsername(usersName);
        String msg = "";
        if (findUser == null){
            usersService.add(users);
            msg = "registered successfully";
            return msg;
        }
        msg = "the user alrealy exists";
        return msg;
    }

}
