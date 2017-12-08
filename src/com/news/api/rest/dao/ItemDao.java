package com.news.api.rest.dao;

import java.util.List;

import com.news.api.rest.domain.NewsItems;
import com.news.api.rest.dto.NewsItemsDto;

public interface ItemDao {
	
	int addNewsItem(NewsItems newsItem);
	
	List<NewsItems> getItems();
	
	List<NewsItems> getItems(int categoryId);




}
