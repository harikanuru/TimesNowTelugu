package com.news.api.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.api.rest.dao.CategoriesDao;
import com.news.api.rest.dao.impl.CategoriesDaoImpl;
import com.news.api.rest.domain.Categories;
import com.news.api.rest.domain.ServiceStatus;
import com.news.api.rest.dto.CategoriesDto;
import com.news.api.rest.service.CategoryService;
import com.news.api.rest.util.CategoriesUtils;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoriesDao categoryDao = new CategoriesDaoImpl();

	@Override
	public int addCategory(CategoriesDto categoriesDto) {

		Categories categories = CategoriesUtils.convertDtoToDao(categoriesDto);

		return categoryDao.addCategory(categories);
	}

	@Override
	public int editCategory(CategoriesDto categoryDto) {
		
		Categories categories = CategoriesUtils.convertDtoToDao(categoryDto);

		return categoryDao.editCategory(categories);

	}

	@Override
	public int deleteCategory(CategoriesDto categoryDto) {

		Categories categories = CategoriesUtils.convertDtoToDao(categoryDto);

		return categoryDao.deleteCategory(categories);

	}

	@Override
	public List<CategoriesDto> getCategories() {

		List<Categories> categories = categoryDao.getCategories();
		List<CategoriesDto>  categoiesDto = CategoriesUtils.convertDaoListToDtoList(categories);
		return categoiesDto;
	}

}
