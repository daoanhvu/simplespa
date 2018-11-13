package com.bkda.simplespa.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2555901618408505483L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cusid")
	private long id;
	
	private String name;
	private String phone;
	private int numOfVisit;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getNumOfVisit() {
		return numOfVisit;
	}
	public void setNumOfVisit(int numOfVisit) {
		this.numOfVisit = numOfVisit;
	}
}
