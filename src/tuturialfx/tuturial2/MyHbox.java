package tuturialfx.tuturial2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class MyHbox extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("MyHBox");
		BorderPane root = new BorderPane();
		
		HBox hBox = new HBox();
		TextField field = new TextField();
		HBox.setHgrow(field, Priority.ALWAYS);
		hBox.getChildren().addAll(new Label("Search:"), field, new Button("Go!"));
		
		Scene scene = new Scene(root, 800, 600);
		root.getChildren().addAll(hBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
