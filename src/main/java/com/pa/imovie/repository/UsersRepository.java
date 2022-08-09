package com.pa.imovie.repository;

import com.pa.imovie.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    @Query(value = "SELECT * FROM users WHERE users_name=?1",nativeQuery = true)
    Users findByUsername(String user_name);


    @Query(value = "SELECT * FROM users WHERE users_name=?1 And users_password=?2",nativeQuery = true)
    Users findUsersByUsernameAndPassword(String user_name,String user_password);


}
