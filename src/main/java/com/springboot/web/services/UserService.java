package com.springboot.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.UserRepo;
import com.springboot.web.model.User;

@Service
public class UserService {
   @Autowired
   private UserRepo userRepo;
   
   public List<User> saveUser(List<User> userList) {
	   this.userRepo.saveAll(userList);
	   return userList;
   }
    
}
