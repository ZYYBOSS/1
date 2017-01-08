package com.java2.web.repository;

import java.util.List;

import com.java2.web.entity.ProductionEntity;

public interface IProductionRepository {
	
	List<ProductionEntity> getProduction();
	
	void addProduction(ProductionEntity production);
	
	void deleteProduction(Integer id);

	void updateProduction(ProductionEntity production);

	ProductionEntity getProductionById(Integer id);
}
