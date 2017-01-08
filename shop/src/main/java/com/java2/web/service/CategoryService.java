package com.java2.web.service;

import java.util.List;

import com.java2.web.dtos.CategoryDTO;

public interface CategoryService {
	
	public List<CategoryDTO> getCategorys();
	
	public void addCategory(CategoryDTO category);
	
	public void deleteCategory(Integer id);
	
	public void updateCategory(CategoryDTO category);
	
	public CategoryDTO getCategoryById(Integer id);

}
