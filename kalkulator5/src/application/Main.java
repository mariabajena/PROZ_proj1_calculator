package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.StackPane;

public class Main extends Application {
	@Override
    public void start(Stage primaryStage) {
		try {
		
		Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}

