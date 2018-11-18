package com.bkda.simplespa.fx.controllers;

import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableCell;
	
public class HyperlinkCellFactory<T> extends TableCell<T, String> {
	private Hyperlink link = new Hyperlink();
	
	public HyperlinkCellFactory() {
		this.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
	}
	
	@Override
	protected void updateItem(String itemText, boolean empty) {
		super.updateItem(itemText, empty);
		
		if(itemText == null || empty) {
			setGraphic(null);
			return;
		}
		
		link.setText(itemText);
		link.setVisited(false);
		setGraphic(link);
	}
}
