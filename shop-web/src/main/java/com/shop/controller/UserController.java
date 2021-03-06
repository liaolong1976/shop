package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.pojo.User;
import com.shop.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/{id}")
	@ResponseBody
	public User SelectUserById(@PathVariable int id) {
		User user = userService.SelectUserById(id);
		return user;
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public String Showmessage() {
		System.out.println("echo");
		return "message";
	}

}
