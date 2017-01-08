package com.java2.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java2.web.dtos.CategoryDTO;
import com.java2.web.entity.CategoryEntity;
import com.java2.web.repository.CategoryRepository;

public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository categoryRepository ;

	@Override
	public List<CategoryDTO> getCategorys() {
		List<CategoryEntity> categorys = categoryRepository.getCategory();
		List<CategoryDTO> dtos = new ArrayList<>();
		for(CategoryEntity categroy : categorys){
			CategoryDTO dto = new CategoryDTO();
			dto.setId(categroy.getId());
			dto.setName(categroy.getName());
			dtos.add(dto);
			}
		return dtos;
	}

	@Override
	public void addCategory(CategoryDTO category) {
		
	}

	@Override
	public void deleteCategory(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(CategoryDTO category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CategoryDTO getCategoryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


}
