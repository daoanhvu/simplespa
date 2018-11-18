package com.bkda.simplespa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {
	public enum RoomStatus {
		AVAILABLE,
		INUSE,
		OUTOFSERVICE
	}
	
	@Id
	@Column(name="roomid")
	private int number;
	
	private RoomStatus status;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public RoomStatus getStatus() {
		return status;
	}
	public void setStatus(RoomStatus status) {
		this.status = status;
	}
}
