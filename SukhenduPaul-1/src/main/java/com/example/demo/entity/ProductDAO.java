package com.example.demo.entity;

public class ProductDAO {
	
	
	private String title;
	private String description;
	
	
	public ProductDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductDAO(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
