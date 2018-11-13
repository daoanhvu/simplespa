package com.bkda.simplespa.fx;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public final class FXUtils {
	
	public static void launchSceen(Stage stage, String fxmlName, String title, int width, int height) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(FXUtils.class.getResource(fxmlName));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load(), width, height);
        Stage fxstage = stage ==  null ? new Stage() : stage;
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
