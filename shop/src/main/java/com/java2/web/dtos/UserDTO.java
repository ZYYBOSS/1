package com.java2.web.dtos;

import java.util.List;

public class UserDTO {
	
	private Long id;
	private String name;
	private List<String> addressList;
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddressList() {
		return addressList;
	}
	public void setAddressList (List<String> addressList) {
		this.addressList = addressList;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
