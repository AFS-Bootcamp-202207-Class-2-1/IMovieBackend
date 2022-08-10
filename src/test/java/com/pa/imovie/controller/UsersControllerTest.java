package com.pa.imovie.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pa.imovie.entity.Users;
import com.pa.imovie.repository.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class UsersControllerTest {

    @Autowired
    MockMvc client;

    @Autowired
    UsersRepository usersRepository;

    @BeforeEach
    void clean(){
        usersRepository.deleteAll();
    }



    //Test:注册成功
    @Test
    void should_register_succeed_and_return_message_registered_successfully_when_call_register_api_given_an_unregistered_user() throws Exception {

        Users users = new Users(null,"wade","abc","male");
        String usersJson = new ObjectMapper().writeValueAsString(users);

        client.perform(MockMvcRequestBuilders.post("/users/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usersJson))
                .andExpect(status().isCreated())
                .andExpect(content().string("registered successfully"));


        List<Users> findUsers = usersRepository.findAll();
        assertThat(findUsers,hasSize(1));
        assertThat(findUsers.get(0).getUsersName(), equalTo("wade"));
        assertThat(findUsers.get(0).getUsersPassword(), equalTo("abc"));
        assertThat(findUsers.get(0).getUsersGender(), equalTo("male"));

    }

    //Test:注册失败——用户已存在
    @Test
    void should_register_fail_and_return_message_registered_fail_when_call_register_api_given_an_registered_user() throws Exception {

        Users users = new Users(null,"wade","abc","male");
        usersRepository.save(users);

        String usersJson = new ObjectMapper().writeValueAsString(users);

        client.perform(MockMvcRequestBuilders.post("/users/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usersJson))
                .andExpect(status().isCreated())
                .andExpect(content().string("the user alrealy exists"));

        List<Users> findUsers = usersRepository.findAll();
        assertThat(findUsers,hasSize(1));
        assertThat(findUsers.get(0).getUsersName(), equalTo("wade"));
        assertThat(findUsers.get(0).getUsersPassword(), equalTo("abc"));
        assertThat(findUsers.get(0).getUsersGender(), equalTo("male"));

    }

    //Test:登录成功
    @Test
    void should_login_succeed_and_return_message_login_successfully_when_call_login_api_given_an_user() throws Exception {

        Users users = new Users(null,"wade","abc","");
        usersRepository.save(users);
        String usersJson = new ObjectMapper().writeValueAsString(users);

        client.perform(MockMvcRequestBuilders.post("/users/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usersJson))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"msg\":\"login successfully\",\"userGender\":\"\",\"userName\":\"wade\"}"));

        List<Users> findUsers = usersRepository.findAll();
        assertThat(findUsers,hasSize(1));
        assertThat(findUsers.get(0).getUsersName(), equalTo("wade"));
        assertThat(findUsers.get(0).getUsersPassword(), equalTo("abc"));

    }


    //Test: 登录失败——密码错误
    @Test
    void should_login_fail_and_return_message_the_username_and_password_are_inconsistent_when_call_login_api_given_an_wrong_password() throws Exception {

        Users users = new Users(null,"wade","abc","");
        usersRepository.save(users);
        Users errorUsers = new Users(null,"wade","error","");
        String usersJson = new ObjectMapper().writeValueAsString(errorUsers);

        client.perform(MockMvcRequestBuilders.post("/users/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usersJson))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"msg\":\"the username and password are inconsistent\",\"userGender\":\"\",\"userName\":\"\"}"));

        List<Users> findUsers = usersRepository.findAll();
        assertThat(findUsers,hasSize(1));
        assertThat(findUsers.get(0).getUsersName(), equalTo("wade"));
        assertThat(findUsers.get(0).getUsersPassword(), equalTo("abc"));

    }

    //Test: 登录失败——用户名错误
    @Test
    void should_login_fail_and_return_message_the_username_and_password_are_inconsistent_when_call_login_api_given_an_wrong_username() throws Exception {

        Users users = new Users(null,"wade","abc","");
        usersRepository.save(users);
        Users errorUsers = new Users(null,"error","abc","");
        String usersJson = new ObjectMapper().writeValueAsString(errorUsers);

        client.perform(MockMvcRequestBuilders.post("/users/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usersJson))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"msg\":\"the username and password are inconsistent\",\"userGender\":\"\",\"userName\":\"\"}"));

        List<Users> findUsers = usersRepository.findAll();
        assertThat(findUsers,hasSize(1));
        assertThat(findUsers.get(0).getUsersName(), equalTo("wade"));
        assertThat(findUsers.get(0).getUsersPassword(), equalTo("abc"));

    }


}


