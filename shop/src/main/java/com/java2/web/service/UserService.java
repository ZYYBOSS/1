package com.java2.web.service;

import java.util.List;

import com.java2.web.dtos.UserDTO;

public interface UserService {
	
	public List<UserDTO> getUsers();
	
	public void addUser(UserDTO user);
	
	public void deleteUser(Long id);
	
	public void updateUser(UserDTO user);
	
    public UserDTO getUserById(Long id);	
    
    public boolean isUserCreditialValid(String userName,String password);
}
