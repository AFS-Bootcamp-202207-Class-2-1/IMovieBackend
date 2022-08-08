package com.pa.imovie.repository;

import com.pa.imovie.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {

    Users findByUsers_name(String users_name);
}
