package com.bkda.simplespa;

import org.hibernate.SessionFactory;

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
		factory = Persistence.createEntityManagerFactory("simplespa");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
		Scene scene = new Scene(root, 1280, 710);
		primaryStage.setTitle("SenSpa v1.0");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static EntityManagerFactory getSessionFactory() {
		return factory;
	}
	
}
