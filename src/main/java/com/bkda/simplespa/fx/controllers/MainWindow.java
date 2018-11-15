package com.bkda.simplespa.fx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.bkda.simplespa.fx.FXUtils;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

public class MainWindow extends GenericController implements Initializable {
	
	private MenuBar mainMenuBar;
	
	@FXML
	private BorderPane mainRoot;
	
	private EventHandler<WindowEvent>  onCloseHandler = new EventHandler<WindowEvent>() {
		@Override
		public void handle(WindowEvent event) {
			Platform.exit();
		}
	};
	
	public MainWindow() {
		initMenuBar();
	}
	
	private void initMenuBar() {
		mainMenuBar = new MenuBar();
//		mainMenuBar.setStyle("-fx-background-color: #90caf9");
        // --- Menu Edit
        Menu menuEdit = new Menu("Chức năng");
        // --- Menu View
        Menu menuView = new Menu("Danh mục");
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
        
        Menu menuSystem = new Menu("Hệ thống");
        MenuItem cashDrawerMenuItem = new MenuItem("Cash drawer");
        menuSystem.getItems().add(cashDrawerMenuItem);
        MenuItem hrItem = new MenuItem("May cham cong");
        menuSystem.getItems().add(hrItem);
        
        // --- Menu Help
        Menu menuHelp = new Menu("Help");
        MenuItem helpMenuItem = new MenuItem("Trợ giúp");
        menuHelp.getItems().add(helpMenuItem);
        
        MenuItem aboutItem = new MenuItem("Về SenSpa 1.0");
        menuHelp.getItems().add(aboutItem);
        
        mainMenuBar.getMenus().addAll(menuEdit, menuView, menuSystem, menuHelp);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mainRoot.setTop(this.mainMenuBar);
		BorderPane transactionPane;
		try {
			transactionPane = (BorderPane) FXUtils.loadComponentFromFXML("/fxml/transaction.fxml");
			mainRoot.setCenter(transactionPane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public EventHandler<WindowEvent> getOnCloseEventHandler() {
		return onCloseHandler;
	}
	
	private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
}
