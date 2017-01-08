package com.java2.web.repository;

import java.util.List;

import com.java2.web.entity.CategoryEntity;

public interface ICategoryRepository {
	
	List<CategoryEntity> getCategory();
	
	void addCategory(CategoryEntity category);
	
	void deleteCategory(Integer id);

	void updateCategory(CategoryEntity category);

	CategoryEntity getCategoryById(Integer id);

}
