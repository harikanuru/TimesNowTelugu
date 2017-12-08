package com.news.api.rest.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;



public class Categories implements Serializable{

	
	private int categoryId;
	private String categoryName;
	private int isActive;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

}
