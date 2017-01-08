package com.java2.web.repository;

import java.util.List;

import com.java2.web.entity.UserEntity;

public interface IUserRepositiory {
	/**
	 * 
	  */
	List<UserEntity> getUsers();
	
	void addUser(UserEntity user);

	void deleteUser(Long id);

	void updateUser(UserEntity user);

	UserEntity getUserById(Long id);

	
}
