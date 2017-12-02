package tutorialfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("MyWin");
		primaryStage.setWidth(300);
		primaryStage.setHeight(300);
		
		Pane root = new Pane();
		
		Button btn = new Button();
		btn.setText("Click Me...");
		btn.setTranslateX(70);
		btn.setTranslateY(140);
		btn.setPrefSize(200, 20);
		
		Rectangle rect = new Rectangle(50, 50);
		
		btn.setOnAction(event -> {
			
			rect.setTranslateX(100);
			rect.setTranslateY(100);
			rect.setWidth(100);
			rect.setHeight(100);
			rect.setFill(Color.RED);
			System.out.println("Hello, my friend!!!");
		});
		
		
		Scene scene = new Scene(root);
		root.getChildren().addAll(btn, rect);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
