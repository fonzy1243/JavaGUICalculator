package com.example.javacalculatorgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class javaCalculator extends Application
{
	@Override
	public void start(Stage stage) throws IOException
	{
		FXMLLoader fxmlLoader = new FXMLLoader(javaCalculator.class.getResource("hello-view.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 320, 470);
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch();
	}
}