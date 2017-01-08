package com.java2.web.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	//addressEntity下的成员变量user
	@OneToMany(mappedBy="userEntity",cascade = {CascadeType.PERSIST})
	private List<AddressEntity> addressList = new ArrayList<>();
	
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

	public List<AddressEntity> getAddressList() {
		return addressList;
	}
	
	public void setAddressList(List<AddressEntity> addressList) {
		this.addressList = addressList;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
