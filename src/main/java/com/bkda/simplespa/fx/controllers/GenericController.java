package com.bkda.simplespa.fx.controllers;

import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public abstract class GenericController {
	
	protected Stage currentStage;
	
	public void setCurrentStage(Stage stage) {
		this.currentStage = stage;
	}
	
	public EventHandler<WindowEvent> getOnCloseEventHandler() {
		return null;
	}
}
