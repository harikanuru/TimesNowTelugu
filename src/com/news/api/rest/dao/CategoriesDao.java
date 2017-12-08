package com.news.api.rest.dao;

import java.util.List;

import com.news.api.rest.domain.Categories;
import com.news.api.rest.domain.ServiceStatus;
import com.news.api.rest.dto.CategoriesDto;

public interface CategoriesDao {
	
	int addCategory(Categories category);
	
	int editCategory(Categories categoryDto);
	
	int deleteCategory(Categories categoryDto);
	
	List<Categories> getCategories();





}
