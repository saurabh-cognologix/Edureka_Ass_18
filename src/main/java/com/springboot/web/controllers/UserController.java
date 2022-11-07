package com.springboot.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.web.model.User;
import com.springboot.web.services.UserService;





@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String showform() {
		return "login";
	}
    
	@RequestMapping(path  = "/processform",method = RequestMethod.POST)	
	public String userLogin(ModelMap model,
			@RequestParam("userName") String username, 
			@RequestParam("password") String password){
		System.out.println("This is login Page");
		System.out.println("User Name is "+username);
		System.out.println("User Password is"+password);
		if(username.equals("Admin") && password.equals("Admin")) {
			List<User> userList = new ArrayList<>();
			userList.add(new User(username,password));
	        this.userService.saveUser(userList);
		}else {
			model.put("errorMsg","Please provide correct userName and password");
		}
		
		return "login";
	}
}
