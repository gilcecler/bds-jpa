package com.devsuperior.uri2611.dto;

import com.devsuperior.uri2611.projection.MovieMinProjection;

public class MovieMinDTO {
	
	private Long Id;
	private String Name;
	
	public MovieMinDTO(Long id, String name) {
		Id = id;
		Name = name;
	}
	
	public MovieMinDTO(MovieMinProjection projection) {
		Id=projection.getId();
		Name=projection.getName();
	}


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "MovieMinDTO [Id=" + Id + ", Name=" + Name + "]";
	}
	
	
	
	
		

}
