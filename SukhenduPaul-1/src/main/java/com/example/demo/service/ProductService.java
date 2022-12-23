package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductDAO;



public interface ProductService {
	
	public List<ProductDAO> getBasedOnCategory(String category);
	public Product saveProduct(Product product);
	
	

}
