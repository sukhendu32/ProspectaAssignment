package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductDAO;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService pservice;
	
	
	//API on giving category detail will return all the Title and Description of that particular category
	@GetMapping("/api.publicapis.org/{categoryName}")
	public ResponseEntity<List<ProductDAO>> getallCategoryDetail(@PathVariable("categoryName") String category){
		
		
		List<ProductDAO> products=pservice.getBasedOnCategory(category);
		
		
		return new ResponseEntity<List<ProductDAO>>(products,HttpStatus.ACCEPTED);
		
	}
	
	
	//saving a new product through responce body
	@PostMapping("/api.publicapis.org")
	public ResponseEntity<Product> saveProduct(@Valid @RequestBody Product product){
		
		Product savedProduct=pservice.saveProduct(product);
		
		
		return new ResponseEntity<Product>(savedProduct,HttpStatus.ACCEPTED);
		
	}
	
	
	
}
