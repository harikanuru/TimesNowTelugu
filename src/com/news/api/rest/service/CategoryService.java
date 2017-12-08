package com.news.api.rest.service;

import java.util.List;

import com.news.api.rest.domain.ServiceStatus;
import com.news.api.rest.dto.CategoriesDto;

public interface CategoryService {
	
	int addCategory(CategoriesDto categoryDto);
	
	int editCategory(CategoriesDto categoryDto);
	
	int deleteCategory(CategoriesDto categoryDto);
	
	List<CategoriesDto> getCategories();

}
