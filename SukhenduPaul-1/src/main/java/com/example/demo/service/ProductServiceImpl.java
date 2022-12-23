package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductDAO;
import com.example.demo.repo.ProductRepo;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo pRepo;
	
	
	@Override
	public List<ProductDAO> getBasedOnCategory(String category) {
		
		//creating a List of ProductDAO which will contain all titles and description of a particular category
		  List<ProductDAO> products=new ArrayList<>();
		  List<Product> allProduct= pRepo.findAll();
		  
		  //finding all the category and creating a productDAO and adding into the list 
		  for(Product p:allProduct) {
			  
			  if(p.getCategory().equals(category)) {
				  ProductDAO pd=new ProductDAO();
					  
				  pd.setDescription(p.getDescription());
				  pd.setTitle(p.getTitle());
				  
				  
				  products.add(pd);
			  }
		  }
		  
		 //sending the ans list
		return products;
	}


	@Override
	public Product saveProduct(Product product) {
		
	
		return pRepo.save(product);
	}

}
