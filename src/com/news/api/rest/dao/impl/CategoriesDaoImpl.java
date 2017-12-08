package com.news.api.rest.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.news.api.rest.dao.CategoriesDao;
import com.news.api.rest.domain.Categories;
import com.news.api.rest.queries.Queries;

@Repository
public class CategoriesDaoImpl implements CategoriesDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public CategoriesDaoImpl() {
		super();
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/news?autoReconnect=true");
		dataSource.setUsername("root");
		dataSource.setPassword("manager");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int addCategory(Categories category) {

		// jdbcTemplate = new JdbcTemplate(createDataSourceObject());
		int rowcount = jdbcTemplate.update(Queries.INSERT_CATEGORY, new Object[] { category.getCategoryName() });
		return rowcount;
	}

	@Override
	public int editCategory(Categories category) {

		// jdbcTemplate = new JdbcTemplate(createDataSourceObject());
		int rowCount = jdbcTemplate.update(Queries.UPDATE_CATEGORY,
				new Object[] { category.getCategoryName(), category.getCategoryId() });
		return rowCount;
	}

	@Override
	public int deleteCategory(Categories category) {

		// jdbcTemplate = new JdbcTemplate(createDataSourceObject());
		int rowCount = jdbcTemplate.update(Queries.DELETE_CATEGORY,
				new Object[] { category.getCategoryId() });
		return rowCount;
	}

	@Override
	public List<Categories> getCategories() {
		// jdbcTemplate = new JdbcTemplate(createDataSourceObject());

		List<Categories> categories = jdbcTemplate.query(Queries.GET_CATEGORIES,
				new BeanPropertyRowMapper<Categories>(Categories.class));

		return categories;

	}
}
