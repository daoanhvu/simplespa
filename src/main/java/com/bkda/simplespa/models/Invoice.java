package com.bkda.simplespa.models;

import java.io.Serializable;
import java.util.Date;

public class Invoice implements Serializable {
	
	public enum PaymentMethod {
		CASH,
		CREDIT_CARD,
		DEBIT_CARD
	}
	
	private long id;
	private String number;
	private Customer customer;
	private Staff staff;
	private Date startTime;
	private Date endTime;
	private PaymentMethod paymentMethod;
	
}
