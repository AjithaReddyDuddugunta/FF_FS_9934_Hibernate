package com.hcl.day40;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDDEC")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String type;
	@Column
	private String city;
	@Column
	private String country;
	
	public Address() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country=country;
		
	}
}
