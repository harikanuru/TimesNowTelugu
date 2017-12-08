package com.news.api.rest.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.news.api.rest.dao.ItemDao;
import com.news.api.rest.domain.Categories;
import com.news.api.rest.domain.NewsItems;
import com.news.api.rest.queries.Queries;

public class ItemDaoImpl implements ItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public ItemDaoImpl() {
		super();
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/news?autoReconnect=true&characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("manager");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int addNewsItem(NewsItems newsItem) {

		int rowcount = jdbcTemplate.update(Queries.INSERT_NEWS_ITEM, new Object[] { newsItem.getHeading(),
				newsItem.getNews(), newsItem.getCategoryId(), newsItem.getImage() });

		return rowcount;
	}

	@Override
	public List<NewsItems> getItems() {

		List<NewsItems> newsItems = jdbcTemplate.query(Queries.GET_NEWS_ITEMS,
				new BeanPropertyRowMapper<NewsItems>(NewsItems.class));

		return newsItems;
	}

	@Override
	public List<NewsItems> getItems(int categoryId) {

		List<NewsItems> newsItems = jdbcTemplate.query(Queries.GET_ITEMS_BY_CATEGORY, new Object[] { categoryId },
				new BeanPropertyRowMapper<NewsItems>(NewsItems.class));

		return newsItems;
	}

}
