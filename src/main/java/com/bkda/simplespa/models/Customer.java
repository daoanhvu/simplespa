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
	private byte gender;
	private String phone;
	private String email;
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
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumOfVisit() {
		return numOfVisit;
	}
	public void setNumOfVisit(int numOfVisit) {
		this.numOfVisit = numOfVisit;
	}
}
