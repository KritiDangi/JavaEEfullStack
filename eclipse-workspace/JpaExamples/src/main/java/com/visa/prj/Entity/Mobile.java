package com.visa.prj.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue(value="mobile")    //single table approach (items)
@Table(name="mobile_3")
public class Mobile extends Item {

	private String connectivity;
	
	public Mobile() {
	}


	public Mobile(int id,String name,double pr,String connectivity) {
		super(id,name,pr);
		this.connectivity = connectivity;
	}


	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	
}
