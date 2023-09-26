package org.comit.Rest.user.controller;

import java.util.List;

import org.comit.Rest.user.bean.UserBean;
import org.comit.Rest.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserDao service;
	
	@GetMapping("/users")
	public List<UserBean> retriveAllUsers(){
		List<UserBean> result = service.findAll();
		return result;
	}
	
	@GetMapping("/users/{id}")
	public UserBean retriveOneUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody UserBean user) {
		UserBean savedUser = service.save(user);
	}
}
