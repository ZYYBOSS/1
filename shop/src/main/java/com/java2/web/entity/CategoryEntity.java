package com.java2.web.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "production_category",
    joinColumns=@JoinColumn(name="category_id",referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name ="production_id",referencedColumnName="id")
	)
	private List<ProductionEntity> productionList = new ArrayList<>();

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

	public List<ProductionEntity> getProductionList() {
		return productionList;
	}

	public void setProductionList(List<ProductionEntity> productionList) {
		this.productionList = productionList;
	}
	
}
