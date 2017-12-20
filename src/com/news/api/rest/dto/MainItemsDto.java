package com.news.api.rest.dto;

import java.io.Serializable;
import java.util.List;


public class MainItemsDto implements Serializable {

	private String categoryName;
	private List<NewsItemsDto> newsItems;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<NewsItemsDto> getNewsItems() {
		return newsItems;
	}

	public void setNewsItems(List<NewsItemsDto> newsItems) {
		this.newsItems = newsItems;
	}
}
