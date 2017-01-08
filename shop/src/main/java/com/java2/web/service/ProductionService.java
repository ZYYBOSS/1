package com.java2.web.service;

import java.util.List;

import com.java2.web.dtos.ProductionDTO;

public interface ProductionService {

	public List<ProductionDTO> getProductions();
	
	public void addProduction(ProductionDTO production);
	
	public void deleteProduction(Integer id);
	
	public void updateProduction(ProductionDTO production);
	
	public ProductionDTO getProductionById(Integer id);

}
