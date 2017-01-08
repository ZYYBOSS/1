//package com.java2.web.entity;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "orders")
//public class OrdersEntity {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@Column(name = "create_date")
//	private Date createDate;
//	private String address;
//	private String state;
//	
//	@ManyToOne()
//	private Long userId;
//	
//}
