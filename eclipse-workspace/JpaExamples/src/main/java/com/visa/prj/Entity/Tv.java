package com.visa.prj.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue(value="tv")    //single table approach (items)
@Table(name="tv_3")
public class Tv extends Item {

	private String screen;
	public Tv() {
	}

	public Tv(int id,String name,double pr,String screen) {
		super(id,name,pr);
		this.screen = screen;
	}

	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	
}
