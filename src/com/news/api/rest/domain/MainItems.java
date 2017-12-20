package com.news.api.rest.domain;

import java.io.Serializable;
import java.util.List;

public class MainItems implements Serializable {

	private String categoryName;
	private List<NewsItems> newsItems;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<NewsItems> getNewsItems() {
		return newsItems;
	}

	public void setNewsItems(List<NewsItems> newsItems) {
		this.newsItems = newsItems;
	}

}
