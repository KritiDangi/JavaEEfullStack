package com.visa.prj.Entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="items_3")
//@DiscriminatorColumn(name="type")     //single table approach (items)
//@Inheritance(strategy=InheritanceType.JOINED)   // joined approach (items_2)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)   // table per class approach (items_3)
public class Item {

	@Id  //denotes primary key   - composite primary key -> @CompositeId
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private double price;
	
	public Item() {
	}
	
	public Item(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}