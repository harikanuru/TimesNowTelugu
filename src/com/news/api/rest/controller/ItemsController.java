package com.news.api.rest.controller;

import javax.websocket.server.PathParam;
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
	
	@Path("/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getWelcomeMessage() {

		return "Item Message";
	}
	
	@Path("/addItem")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addItem(NewsItemsDto newsItem) {
		
		System.out.println("Controller "+newsItem.getHeading() +" "+ newsItem.getCategoryId()+" "+ newsItem.getNews());
        
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
	@Produces(MediaType.APPLICATION_JSON)
	public Response getItems(@RequestBody CategoriesDto categories) {
		
		 System.out.println(categories.getCategoryId());

		return Response.status(200).entity(itemService.getItems(categories.getCategoryId())).build();
	}
	
	
}
