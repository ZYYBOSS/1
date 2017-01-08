package com.java2.web.service;

import java.util.List;

import com.java2.web.dtos.AddressDTO;

public interface AddressService {
	
	public List<AddressDTO> getAddresss();
	
	public void addAddress(AddressDTO address);
	
	public void updateAddress(AddressDTO address);
	
	public void deleteAddress(Long id);
	
	public AddressDTO getAddressById(Long id); 
}
