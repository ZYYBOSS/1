package com.java2.web.dtos;

import java.util.List;

public class ProductionDTO {
	private Long id;
	private String name;
	private String description;
	private double originalPrice;
	private double price;
	private List<String> categoryList;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<String> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}

}
