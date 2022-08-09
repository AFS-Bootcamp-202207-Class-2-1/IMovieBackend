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

    @Test
    void should_register_succeed_and_return_message_registered_successfully_when_call_register_api_given_an_unregistered_user() throws Exception {

        Users users = new Users(null,"wade","abc","male");
        String usersJson = new ObjectMapper().writeValueAsString(users);

        client.perform(MockMvcRequestBuilders.post("/users/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usersJson))
                .andExpect(status().isOk())
                .andExpect(content().string("registered successfully"));


        List<Users> findUsers = usersRepository.findAll();
        assertThat(findUsers,hasSize(1));
        assertThat(findUsers.get(0).getUsers_name(), equalTo("wade"));
        assertThat(findUsers.get(0).getUsers_password(), equalTo("abc"));
        assertThat(findUsers.get(0).getUsers_gender(), equalTo("male"));

    }

    @Test
    void should_register_fail_and_return_message_registered_fail_when_call_register_api_given_an_registered_user() throws Exception {

        Users users = new Users(null,"wade","abc","male");
        usersRepository.save(users);

        String usersJson = new ObjectMapper().writeValueAsString(users);

        client.perform(MockMvcRequestBuilders.post("/users/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usersJson))
                .andExpect(status().isOk())
                .andExpect(content().string("the user alrealy exists"));


        List<Users> findUsers = usersRepository.findAll();
        assertThat(findUsers,hasSize(1));
        assertThat(findUsers.get(0).getUsers_name(), equalTo("wade"));
        assertThat(findUsers.get(0).getUsers_password(), equalTo("abc"));
        assertThat(findUsers.get(0).getUsers_gender(), equalTo("male"));

    }


}


