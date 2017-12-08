package com.news.api.rest.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

import com.news.api.rest.dto.CategoriesDto;
import com.news.api.rest.service.CategoryService;
import com.news.api.rest.service.impl.CategoryServiceImpl;

@Controller
@Path("/category")
public class CategoriesController {

	// @Autowired
	CategoryService categoryService = new CategoryServiceImpl();

	@Path("/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getWelcomeMessage() {

		return "Category Message";
	}

	@Path("/addCategory")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addCategory(CategoriesDto categoriesDto) {

		return Response.status(200).entity(categoryService.addCategory(categoriesDto)).build();
	}
	
	
	@Path("/editCategory")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response editCategory(CategoriesDto categoriesDto) {

		return Response.status(200).entity(categoryService.editCategory(categoriesDto)).build();
	}
	
	@Path("/deleteCategory")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteCategory(CategoriesDto categoriesDto) {

		return Response.status(200).entity(categoryService.deleteCategory(categoriesDto)).build();
	}
	
	@Path("/getCategories")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCategories() {

		return Response.status(200).entity(categoryService.getCategories()).build();
	}
	
	
	
	

}
