package com.bkda.simplespa.fx.controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

import com.bkda.simplespa.dao.CategoryDAO;
import com.bkda.simplespa.models.Category;

import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;

public class CategoryCtrl implements Initializable {
	
	@FXML
	private TextField txtServiceName;
	
	@FXML
	private TextField txtRefPrice;
	
	@FXML
	private TableView<Category> tbServices;
	
	@FXML
	private TableColumn<Category, String> columnName;
	
	private CategoryDAO categoryDAO;
	
	@FXML
	protected void onSearchClick(ActionEvent evt) {
	}
	
	@FXML
	protected void onAddNew(ActionEvent evt) {
		Category cat = new Category();
		cat.setName("Cat 1");
		cat.setRefPice(200000);
		categoryDAO.addCategory(cat);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		columnName.setCellFactory(col -> new HyperlinkCellFactory<Category>());
		
		categoryDAO = new CategoryDAO();
		
		for(int i=0; i<20; i++) {
			Category cat = new Category();
			cat.setName("Cat " + i);
			cat.setRefPice(200000);
			categoryDAO.addCategory(cat);
		}
		
		tbServices.getItems().addAll(generateTableViewRows(categoryDAO.getAllCategories()));
	}
	
	private ObservableList<Category> generateTableViewRows(List<Category> categories) {
        ObservableList<Category> tableViewRows = FXCollections.observableArrayList();
        tableViewRows.addAll(categories);
        return tableViewRows;
    }
}
