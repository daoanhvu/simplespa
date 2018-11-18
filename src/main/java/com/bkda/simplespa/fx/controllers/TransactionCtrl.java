package com.bkda.simplespa.fx.controllers;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;

public class TransactionCtrl extends GenericController {
	

	
	@FXML
	private TableView tbServices;
	@FXML
	private TableView tbSummary;
	@FXML
	private ComboBox cboRoomNumber;
	@FXML
	private TextField txtCustomer;
	@FXML
	private DatePicker dpFromTime;
	@FXML
	private DatePicker dpToTime;
	
	@FXML
	protected void onPrintReceipt(ActionEvent evt) {
		
	}
}
