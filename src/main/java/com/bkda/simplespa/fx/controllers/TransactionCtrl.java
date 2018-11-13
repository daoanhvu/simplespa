package com.bkda.simplespa.fx.controllers;

import java.io.IOException;

import com.bkda.simplespa.fx.FXUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;

public class TransactionCtrl {
	@FXML
	protected void onLoginClick(ActionEvent evt) {
		try {
			FXUtils.launchSceen(null, "/fxml/main_window.xml", "SenSpa v1.0", 1280, 710);
			((Node)evt.getTarget()).getScene().getWindow().hide();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
