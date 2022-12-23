package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	@NotNull @NotEmpty @NotBlank(message = "title is mandatory")
	private String title;
	@NotNull @NotEmpty @NotBlank(message = "category is mandatory")
	private String category;
	@NotNull @NotEmpty @NotBlank(message = "description is mandatory")
	private String description;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Product(Integer productId, String title, String category, String description) {
		super();
		this.productId = productId;
		this.title = title;
		this.category = category;
		this.description = description;
	}
	
	
	
}
