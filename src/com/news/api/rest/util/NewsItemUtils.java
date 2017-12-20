package com.news.api.rest.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.news.api.rest.domain.MainItems;
import com.news.api.rest.domain.NewsItems;
import com.news.api.rest.dto.MainItemsDto;
import com.news.api.rest.dto.NewsItemsDto;

public class NewsItemUtils {

	public static MainItemsDto convertMainItemdaoToDto(MainItems mainItem) {

		MainItemsDto mainItemDto = new MainItemsDto();

		mainItemDto.setCategoryName(mainItem.getCategoryName());
		mainItemDto.setNewsItems(convertNewsItemDaoListToDtoList(mainItem.getNewsItems()));

		return mainItemDto;

	}

	public static MainItems convertMainItemdtoToDao(MainItemsDto mainItem) {

		MainItems mainItemDto = new MainItems();

		mainItemDto.setCategoryName(mainItem.getCategoryName());
		mainItemDto.setNewsItems(convertNewsItemDtoListToDaoList(mainItem.getNewsItems()));

		return mainItemDto;

	}

	public static List<MainItemsDto> convertMainItemdaoToDtoList(List<MainItems> mainItem) {

		List<MainItemsDto> mainItemsDtoList = new ArrayList<>();

		for (int i = 0; i < mainItem.size(); i++) {
			MainItemsDto mainItemDto = new MainItemsDto();

			mainItemDto.setCategoryName(mainItem.get(i).getCategoryName());
			mainItemDto.setNewsItems(convertNewsItemDaoListToDtoList(mainItem.get(i).getNewsItems()));

			mainItemsDtoList.add(mainItemDto);
		}

		return mainItemsDtoList;

	}

	public static List<MainItems> convertMainItemdtoToDao(List<MainItemsDto> mainItemDtoList) {

		List<MainItems> mainItemsList = new ArrayList<>();

		for (int i = 0; i < mainItemDtoList.size(); i++) {
			MainItems mainItem = new MainItems();

			mainItem.setCategoryName(mainItemDtoList.get(i).getCategoryName());
			mainItem.setNewsItems(convertNewsItemDtoListToDaoList(mainItemDtoList.get(i).getNewsItems()));
			mainItemsList.add(mainItem);

		}

		return mainItemsList;

	}

	public static NewsItemsDto convertNewsItemDaoToDto(NewsItems newsItems) {

		NewsItemsDto newsItemDto = new NewsItemsDto();

		newsItemDto.setCategoryId(newsItems.getCategoryId());
		newsItemDto.setHeading(newsItems.getHeading());
		newsItemDto.setNews(newsItems.getNews());
		newsItemDto.setCreatedDate(newsItems.getCreatedDate());
		newsItemDto.setImage(newsItems.getImage());
		newsItemDto.setItemId(newsItems.getItemId());

		return newsItemDto;
	}

	public static NewsItems convertNewsItemDtooDao(NewsItemsDto newsItemDto) {

		NewsItems newsItems = new NewsItems();

		newsItems.setCategoryId(newsItemDto.getCategoryId());
		newsItems.setHeading(newsItemDto.getHeading());
		newsItems.setNews(newsItemDto.getNews());
		newsItems.setCreatedDate(newsItemDto.getCreatedDate());
		newsItems.setImage(newsItemDto.getImage());
		newsItems.setItemId(newsItemDto.getItemId());

		return newsItems;
	}

	public static List<NewsItemsDto> convertNewsItemDaoListToDtoList(List<NewsItems> newsItemsList) {

		List<NewsItemsDto> newsItemsDtoList = new ArrayList<NewsItemsDto>();

		for (Iterator<NewsItems> newItemObj = newsItemsList.iterator(); newItemObj.hasNext();) {

			NewsItems newsItem = newItemObj.next();
			NewsItemsDto newsItemDto = new NewsItemsDto();

			newsItemDto.setCategoryId(newsItem.getCategoryId());
			newsItemDto.setHeading(newsItem.getHeading());
			newsItemDto.setNews(newsItem.getNews());
			newsItemDto.setCreatedDate(newsItem.getCreatedDate());
			newsItemDto.setImage(newsItem.getImage());
			newsItemDto.setItemId(newsItem.getItemId());

			newsItemsDtoList.add(newsItemDto);
		}
		return newsItemsDtoList;
	}

	public static List<NewsItems> convertNewsItemDtoListToDaoList(List<NewsItemsDto> newsItemDtoList) {

		List<NewsItems> newsItemsList = new ArrayList<NewsItems>();

		for (Iterator<NewsItemsDto> newItemObj = newsItemDtoList.iterator(); newItemObj.hasNext();) {

			NewsItemsDto newsItemdto = newItemObj.next();
			NewsItems newsItem = new NewsItems();

			newsItem.setCategoryId(newsItemdto.getCategoryId());
			newsItem.setHeading(newsItemdto.getHeading());
			newsItem.setNews(newsItemdto.getNews());
			newsItem.setCreatedDate(newsItemdto.getCreatedDate());
			newsItem.setImage(newsItemdto.getImage());
			newsItem.setItemId(newsItemdto.getItemId());

			newsItemsList.add(newsItem);
		}

		return newsItemsList;
	}

}
