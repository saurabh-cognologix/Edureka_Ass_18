package com.springboot.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.User;

public interface UserRepo extends JpaRepository<User, String> {

}
