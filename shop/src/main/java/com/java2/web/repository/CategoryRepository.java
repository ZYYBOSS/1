package com.java2.web.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java2.web.entity.CategoryEntity;
@Repository
@Transactional
public class CategoryRepository implements ICategoryRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<CategoryEntity> getCategory() {
		
		return em.createQuery("from CategroyEntity", CategoryEntity.class).getResultList();
	}

	@Override
	public void addCategory(CategoryEntity category) {
		em.persist(category);
	}

	@Override
	public void deleteCategory(Integer id) {
		em.remove(em.find(CategoryEntity.class, id));
	}

	@Override
	public void updateCategory(CategoryEntity category) {
		em.merge(category);
	}

	@Override
	public CategoryEntity getCategoryById(Integer id) {
		return em.find(CategoryEntity.class, id);
	}

}
