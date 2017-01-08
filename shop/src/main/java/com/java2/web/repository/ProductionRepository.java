package com.java2.web.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.java2.web.entity.ProductionEntity;

@Repository
public class ProductionRepository implements IProductionRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<ProductionEntity> getProduction() {
		return em.createQuery("from ProductionEntity",ProductionEntity.class).getResultList();
	}

	@Override
	public void addProduction(ProductionEntity production) {
		em.persist(production);		
	}

	@Override
	public void deleteProduction(Integer id) {
		em.remove(em.find(ProductionEntity.class, id));
	}

	@Override
	public void updateProduction(ProductionEntity production) {
		em.merge(production);
	}

	@Override
	public ProductionEntity getProductionById(Integer id) {
		return em.find(ProductionEntity.class, id);
	}

}
