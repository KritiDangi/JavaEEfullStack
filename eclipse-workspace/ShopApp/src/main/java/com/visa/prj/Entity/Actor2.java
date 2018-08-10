package com.visa.prj.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="actors")
public class Actor2 {

	@Id  //denotes primary key   - composite primary key -> @CompositeId
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //auto generated, auto increment, only for int or long 
	private int aId;
	
	@Column(name="name",length=100,nullable=false)
	private String name;
	
	@ManyToMany(mappedBy="actors")
	private List<Movie2> movies=new ArrayList<>();
	
	public Actor2() {
	}

	public Actor2(int aId, String name, List<Movie2> movies) {
		super();
		this.aId = aId;
		this.name = name;
		this.movies = movies;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie2> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie2> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Actor2 [aId=" + aId + ", name=" + name + ", movies=" + movies + "]";
	}

}
