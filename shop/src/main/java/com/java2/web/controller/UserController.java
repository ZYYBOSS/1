package com.java2.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java2.web.dtos.UserDTO;
import com.java2.web.service.UserService;

@RestController
@RequestMapping(path="/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="",method = RequestMethod.GET)
	public List<UserDTO> getUsers(){
		return userService.getUsers();
	}
	@RequestMapping(path = "postUser", method = RequestMethod.POST)
	public void addPerson(@RequestBody UserDTO user) {
		userService.addUser(user);
	}
	
	@RequestMapping(path = "deleteUser/{id}", method = RequestMethod.DELETE)
	public void deletePerson(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
	
	@RequestMapping(path = "updateUser", method = RequestMethod.PUT)
	public void uptatePerson(@RequestBody UserDTO user) {
		userService.updateUser(user);
	}

	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
