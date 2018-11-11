package com.bkda.simplespa.models;

import java.io.Serializable;
import java.util.Date;

public class Invoice implements Serializable {
	private long id;
	private String number;
	private Staff staff;
	private Date startTime;
	private Date endTime;
	
}
