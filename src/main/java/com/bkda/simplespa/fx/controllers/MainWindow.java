package com.bkda.simplespa.fx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.bkda.simplespa.fx.FXUtils;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MainWindow implements Initializable {
	
	private MenuBar mainMenuBar;
	
	@FXML
	private BorderPane mainRoot;
	
	public MainWindow() {
		initMenuBar();
	}
	
	private void initMenuBar() {
		mainMenuBar = new MenuBar();
		// --- Menu File
        Menu menuFile = new Menu("File");
 
        // --- Menu Edit
        Menu menuEdit = new Menu("Edit");
 
        // --- Menu View
        Menu menuView = new Menu("View");
        MenuItem categoryItem = new MenuItem("Danh mục dịch vụ");
        menuView.getItems().add(categoryItem);
        categoryItem.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                try {
                	BorderPane categoryPane = (BorderPane) FXUtils.loadComponentFromFXML("/fxml/categories.fxml");
                	mainRoot.setCenter(categoryPane);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        MenuItem staffItem = new MenuItem("Quản lý nhân viên");
        menuView.getItems().add(staffItem);
        staffItem.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                try {
                	BorderPane staffPane = (BorderPane) FXUtils.loadComponentFromFXML("/fxml/staffs.fxml");
                	mainRoot.setCenter(staffPane);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        // --- Menu Help
        Menu menuHelp = new Menu("Help");
        MenuItem helpMenuItem = new MenuItem("Trợ giúp");
        menuHelp.getItems().add(helpMenuItem);
        
        MenuItem aboutItem = new MenuItem("Về SenSpa 1.0");
        menuHelp.getItems().add(aboutItem);
        
        mainMenuBar.getMenus().addAll(menuFile, menuEdit, menuView, menuHelp);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mainRoot.setTop(this.mainMenuBar);
	}
	
}
