package com.java2.web.repository;

import java.util.List;

import com.java2.web.entity.AddressEntity;

public interface IAddressRepository {
	
	List<AddressEntity> getAddress();
	
	void addAddress(AddressEntity address);
	
	void deleteAddress(Long id);

	void updateAddress(AddressEntity address);

	AddressEntity getAddressById(Long id);
	

}
