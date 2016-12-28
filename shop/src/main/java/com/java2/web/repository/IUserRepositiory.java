package com.java2.web.repository;

import com.java2.web.entity.UserEntity;

public interface IUserRepositiory {

	void deleteUser(Integer id);

	UserEntity getUserById(Integer id);

	void updateUser(UserEntity user);

}
