package com.news.api.rest.service;

import java.util.List;

import com.news.api.rest.domain.NewsItems;
import com.news.api.rest.dto.NewsItemsDto;

public interface ItemService {

	int addNewsItem(NewsItemsDto newsItem);
	
	List<NewsItemsDto> getItems();
	
	List<NewsItemsDto> getItems(int categoryId);


}
