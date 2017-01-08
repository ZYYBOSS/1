package com.java2.web.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "address")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String address;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	//忽略某个元素，不加会死循环不停读取list
	@JsonIgnore
	private UserEntity userEntity;

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

	public UserEntity getUser() {
		return userEntity;
	}

	public void setUser(UserEntity user) {
		this.userEntity = user;
	}

}
