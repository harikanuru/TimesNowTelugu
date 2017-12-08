package com.news.api.rest.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.news.api.rest.domain.Categories;
import com.news.api.rest.dto.CategoriesDto;

public class CategoriesUtils {

	/*
	 * Converting Dao Object to Dto Object
	 */
	public static CategoriesDto convertDaoToDto(Categories categories) {

		CategoriesDto categoriesDto = new CategoriesDto();

		categoriesDto.setCategoryId(categories.getCategoryId());
		categoriesDto.setCategoryName(categories.getCategoryName());
		categoriesDto.setIsActive(categories.getIsActive());

		return categoriesDto;

	}

	/*
	 * Converting Dto Object to Dao Object
	 */
	public static Categories convertDtoToDao(CategoriesDto categoriesDto) {

		Categories categories = new Categories();

		categories.setCategoryId(categoriesDto.getCategoryId());
		categories.setCategoryName(categoriesDto.getCategoryName());
		categories.setIsActive(categoriesDto.getIsActive());

		return categories;
	}

	/*
	 * Converting Dto Object to Dao Object
	 */
	public static List<CategoriesDto> convertDaoListToDtoList(List<Categories> categories) {

		List<CategoriesDto> categoriesDtoList = new ArrayList<CategoriesDto>();
		for (Iterator<Categories> categoryItem = categories.iterator(); categoryItem.hasNext();) {

			Categories category = categoryItem.next();
			CategoriesDto categoriesDto = new CategoriesDto();
			categoriesDto.setCategoryId(category.getCategoryId());
			categoriesDto.setCategoryName(category.getCategoryName());
			categoriesDto.setIsActive(category.getIsActive());

			categoriesDtoList.add(categoriesDto);
		}

		return categoriesDtoList;
	}

}
