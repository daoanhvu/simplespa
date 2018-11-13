package com.bkda.simplespa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="catid")
	private long id;
	
	private String name;
	
	private long refPice;
	
	private String unit;
	
	private long numberOfUses;
	
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
	public long getRefPice() {
		return refPice;
	}
	public void setRefPice(long refPice) {
		this.refPice = refPice;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public long getNumberOfUses() {
		return numberOfUses;
	}
	public void setNumberOfUses(long numberOfUses) {
		this.numberOfUses = numberOfUses;
	}
	
}
