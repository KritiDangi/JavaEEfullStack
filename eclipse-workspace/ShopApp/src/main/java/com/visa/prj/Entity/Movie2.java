package com.visa.prj.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.engine.spi.CascadeStyle;

@Entity
@Table(name="movies")
public class Movie2 {

	@Id  //denotes primary key   - composite primary key -> @CompositeId
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //auto generated, auto increment, only for int or long 
	private int mId;
	
	@Column(name="name",length=100,nullable=false)
	private String name;
	
	
	/*
	 * (cascade=CascadeType.PERSIST)
	 * if a movie is created and actors are not here, add actors to table.
	 * but if a movie is deleted, dont delete the actors
	 */
	@ManyToMany(cascade=CascadeType.PERSIST)
	/*
	 * if i want to go from movies to actor, ie given a movie, get the actors
	 * then then join column is direct link(movie to link table)
	 * and inverse join column is the other link(link table to actor)
	 */
	@JoinTable(name="MOVIE_ACTOR", inverseJoinColumns = {
			@JoinColumn(name="aId")  
	}, joinColumns = {
			@JoinColumn(name="mId")
	})	
	private List<Actor2>actors=new ArrayList<>();	
	
	public Movie2() {
	}

	public Movie2(int id, String name, List<Actor2> actors) {
		super();
		this.mId = id;
		this.name = name;
		this.actors = actors;
	}

	public int getId() {
		return mId;
	}

	public void setId(int id) {
		this.mId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Actor2> getActors() {
		return actors;
	}

	public void setActors(List<Actor2> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie2 [id=" + mId + ", name=" + name + ", actors=" + actors + "]";
	}

}
