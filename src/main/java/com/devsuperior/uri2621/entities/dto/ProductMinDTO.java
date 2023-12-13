package com.devsuperior.uri2621.entities.dto;

import com.devsuperior.uri2621.projection.ProductMinProjection;

public class ProductMinDTO {

	private String Name;

	public ProductMinDTO(String name) {
		Name = name;
	}

	public ProductMinDTO(ProductMinProjection projection) {
		Name = projection.getName();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "ProductMinDTO [Name=" + Name + "]";
	}
	
	

}
