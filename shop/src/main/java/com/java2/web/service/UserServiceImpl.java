package com.java2.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java2.web.dtos.UserDTO;
import com.java2.web.entity.AddressEntity;
import com.java2.web.entity.UserEntity;
import com.java2.web.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepsitory;
	@Transactional
	@Override
	public List<UserDTO> getUsers() {
		List<UserEntity> users = userRepsitory.getUsers();
		List<UserDTO> dtos = new ArrayList<>();
		
		for(UserEntity user:users){
			UserDTO dto = new UserDTO();
			dto.setId(user.getId());
			dto.setName(user.getName());
			dto.setPassword(user.getPassword());
			List<AddressEntity> addresses = user.getAddressList();
			List<String> addressName = new ArrayList<>(); 
			for(AddressEntity address : addresses){
				addressName.add(address.getAddress());
			}
			dto.setAddressList(addressName);			
			dtos.add(dto);
		}
		return dtos;
	}
	

	@Transactional
	@Override
	public void addUser(UserDTO user) {
		UserEntity userEntity = new UserEntity();
		userEntity.setName(user.getName());
		userRepsitory.addUser(userEntity);
	}

	
	@Override
	@Transactional
	public void deleteUser(Long id) {
		userRepsitory.deleteUser(id);
	}


	@Transactional
	@Override
	public void updateUser(UserDTO user) {
		UserEntity userEntity = new UserEntity();
		userEntity.setName(user.getName());
		userRepsitory.addUser(userEntity);
	}


	@Transactional
	@Override
	public UserDTO getUserById(Long id) {
		UserEntity userEntity = userRepsitory.getUserById(id);
		UserDTO dto = new UserDTO();
		
		dto.setId(userEntity.getId());
		dto.setName(userEntity.getName());
		return dto;
	}

	public boolean isUserCreditialValid(String userName,String password){
		return true;
	}
}
