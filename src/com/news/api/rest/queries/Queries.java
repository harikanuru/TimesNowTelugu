package com.news.api.rest.queries;

public interface Queries {

	/** Query to get roles list */
	String GET_CATEGORIES = "select * from Categories;";

	String INSERT_CATEGORY = "insert into Categories(categoryName) values(?)";

	String UPDATE_CATEGORY = "update Categories set categoryName = ? where categoryId = ?";

	String DELETE_CATEGORY = "delete from Categories where categoryId = ?";

	String INSERT_NEWS_ITEM = "insert into NewsItems(heading, news, categoryId , image) values(?, ? , ?, ?)";

	String GET_NEWS_ITEMS = "select * from NewsItems where categoryId = ? limit 4";

	String GET_ITEMS_BY_CATEGORY = "select * from NewsItems where categoryId = ?";

}
