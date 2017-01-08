package com.java2.web.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "production")

public class ProductionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String description;
	
	@Column(name = "original_price")
	private double originalPrice;
	
	private double price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "production_category",
    joinColumns=@JoinColumn(name="production_id",referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name ="categroy_id",referencedColumnName="id")
	)
	private List<CategoryEntity> categoryList = new ArrayList<>();

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

	public List<CategoryEntity> getCateList() {
		return categoryList;
	}

	public void setCateList(List<CategoryEntity> cateList) {
		this.categoryList = cateList;
	} 
	
	
}
