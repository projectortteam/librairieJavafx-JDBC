package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		//On charge le FXML, qui lui meme va intancier son contrôleur
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Bonjour.fxml"));		
		AnchorPane root = (AnchorPane) loader.load();
	    

	Scene scene = new Scene(root);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
} catch(Exception e) {
	e.printStackTrace();
}

	}
public static void main(String[] args) {
launch(args);
}
}


	
