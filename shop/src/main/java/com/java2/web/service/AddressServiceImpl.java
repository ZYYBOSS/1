package com.java2.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java2.web.dtos.AddressDTO;
import com.java2.web.dtos.UserDTO;
import com.java2.web.entity.AddressEntity;
import com.java2.web.entity.UserEntity;
import com.java2.web.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepository addressRepsitory;
	
	@Transactional
	@Override
	public List<AddressDTO> getAddresss() {
		List<AddressEntity> addresses = addressRepsitory.getAddress();
		List<AddressDTO> dtos = new ArrayList<>();
		for( AddressEntity address:addresses){
			AddressDTO dto = new AddressDTO();
			dto.setId(address.getId());
			dto.setAddress(address.getAddress());
			dtos.add(dto);
		}
		return dtos;

	}

	@Transactional
	@Override
	public void addAddress(AddressDTO address) {
		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setAddress(address.getAddress());
		addressEntity.setUser(addressEntity.getUser());;
	}


	@Override
	public void updateAddress(AddressDTO address) {
		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setAddress(address.getAddress());
//		addressEntity.setUser(address.getUserId());
		addressRepsitory.addAddress(addressEntity);
	}

	@Override
	public void deleteAddress(Long id) {
		
	}

	@Override
	public AddressDTO getAddressById(Long id) {
		AddressEntity addressEntity = addressRepsitory.getAddressById(id);
		AddressDTO dto = new AddressDTO();
		
		dto.setId(addressEntity.getId());
		dto.setAddress(addressEntity.getAddress());
//		dto.setUserId(addressEntity.getUser().getId());
		return dto;

	}

}
