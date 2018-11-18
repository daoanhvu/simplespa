package com.bkda.simplespa;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javax.persistence.Persistence;

import javax.persistence.EntityManagerFactory;

public class FXApplication extends Application {
	
	private static EntityManagerFactory factory;
	
	public static void main(String[] args) {
		//String aString = FXApplication.class.getClassLoader().getResource("/IsadoraCyrPro.ttf").toExternalForm();
		//InputStream fontStream = FXApplication.class.getResourceAsStream("/IsadoraCyrPro.ttf");
		//if(fontStream == null) System.out.println("FUCKING STREAM LOADER!!!!!");
		//System.out.println("external Form: " + aString);
		factory = Persistence.createEntityManagerFactory("simplespa");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		String fontStr = FXApplication.class.getResource("/IsadoraCyrPro.ttf").toExternalForm();
//		if(fontStr == null) System.out.println("FUCKING RESOURCE STREAM LOADER!!!!!");
//		Font isadoraFont = Font.loadFont(fontStr, 64.0);
//		if(isadoraFont == null) {
//			System.out.println("FUCKING FONT LOADER!!!!!");
//		}
		
		Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
		Scene scene = new Scene(root, 1280, 710);
		primaryStage.setTitle("SenSpa v1.0");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static EntityManagerFactory getSessionFactory() {
		return factory;
	}
	
}
