package com.news.api.rest.service.impl;

import java.util.List;

import com.news.api.rest.dao.ItemDao;
import com.news.api.rest.dao.impl.ItemDaoImpl;
import com.news.api.rest.domain.MainItems;
import com.news.api.rest.domain.NewsItems;
import com.news.api.rest.dto.MainItemsDto;
import com.news.api.rest.dto.NewsItemsDto;
import com.news.api.rest.service.ItemService;
import com.news.api.rest.util.NewsItemUtils;

public class ItemServiceImpl implements ItemService {

	ItemDao itemDao = new ItemDaoImpl();

	@Override
	public int addNewsItem(NewsItemsDto newsItemDto) {

		NewsItems newsItem = NewsItemUtils.convertNewsItemDtooDao(newsItemDto);

		return itemDao.addNewsItem(newsItem);

	}

	@Override
	public List<MainItemsDto> getItems() {

		List<MainItems> mainItem = itemDao.getItems();

		List<MainItemsDto> mainItemsListDto = NewsItemUtils.convertMainItemdaoToDtoList(mainItem);

		return mainItemsListDto;
	}

	@Override
	public List<NewsItemsDto> getItems(int categoryId) {

		List<NewsItems> newItems = itemDao.getItems(categoryId);

		List<NewsItemsDto> newsItemsDtoList = NewsItemUtils.convertNewsItemDaoListToDtoList(newItems);

		return newsItemsDtoList;
	}

}
