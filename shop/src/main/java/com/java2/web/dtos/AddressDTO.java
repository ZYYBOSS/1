package com.java2.web.dtos;

public class AddressDTO {
	private Long id;
	
	private String address;
	
	private UserDTO user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserDTO getUserDTO() {
		return user;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.user = userDTO;
	}
	
	

}
