package com.news.api.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.news.api.rest.domain.NewsItems;
import com.news.api.rest.dto.CategoriesDto;
import com.news.api.rest.dto.NewsItemsDto;
import com.news.api.rest.service.ItemService;
import com.news.api.rest.service.impl.ItemServiceImpl;

@Controller
@Path("/item")
public class ItemsController {

	ItemService itemService = new ItemServiceImpl();
	
	@Path("/addItem")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addItem(NewsItemsDto newsItem) {
		
        
		return Response.status(200).entity(itemService.addNewsItem(newsItem)).build();
	}
	
	
	@Path("/getItems")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getItems() {

		return Response.status(200).entity(itemService.getItems()).build();
	}
	
	
	@Path("/getItemsByCategory")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getItems(@RequestBody CategoriesDto categories) {
		

		return Response.status(200).entity(itemService.getItems(categories.getCategoryId())).build();
	}
	

/*	@Path("/getItemsByCategory")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getItemsById(@RequestBody NewsItemsDto newsItemDto) {
		

		return Response.status(200).entity(itemService.getItemsById(newsItemDto.getItemId())).build();
	}*/

}
