package com.bkda.simplespa.fx;

import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

import com.bkda.simplespa.fx.controllers.GenericController;

public final class FXUtils {
	
	public static void launchSceen(Stage stage, String fxmlName, String title, int width, int height) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(FXUtils.class.getResource(fxmlName));
        Scene scene = new Scene(fxmlLoader.load(), width, height);
        Stage fxstage = stage ==  null ? new Stage() : stage;
        GenericController controller = fxmlLoader.getController();
        EventHandler<WindowEvent> onCloseEventHandler = controller.getOnCloseEventHandler();
        if(onCloseEventHandler != null) {
        	fxstage.setOnCloseRequest(onCloseEventHandler);
        }
        controller.setCurrentStage(fxstage);
        fxstage.setTitle(title);
        fxstage.setScene(scene);
        fxstage.show();
	}
	
	public static Object loadComponentFromFXML(String fxmlName) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(FXUtils.class.getResource(fxmlName));
        return fxmlLoader.load();
	}
}
