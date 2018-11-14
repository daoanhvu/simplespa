package com.bkda.simplespa.fx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.bkda.simplespa.fx.FXUtils;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.stage.WindowEvent;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginForm extends GenericController implements Initializable {
	
	@FXML
	private Text actionTarget;
	
	@FXML
	private GridPane loginForm;
	
	@FXML
	private TextField txtLoginName;
	
	@FXML
	private TextField txtPassword;
	
	@FXML
	protected void onLoginClick(ActionEvent evt) {
		try {
			FXUtils.launchSceen(null, "/fxml/main_window.xml", "SenSpa v1.0", 1280, 710);
			((Node)evt.getTarget()).getScene().getWindow().hide();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}
