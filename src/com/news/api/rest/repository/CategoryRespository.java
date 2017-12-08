package com.news.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.news.api.rest.domain.Categories;


public interface CategoryRespository extends JpaRepository<Categories,Integer>{

}
