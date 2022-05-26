package chapter15Personal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LifeCycleDemo extends Application {
    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void init() {
	System.out.println("In init() method");
    }

    @Override
    public void start(Stage primaryStage) {
	primaryStage.setTitle("Life cycle demo");
	StackPane root = new StackPane();
	primaryStage.setScene(new Scene(root, 300, 75));
	primaryStage.show();
	System.out.println("In start() method");
    }

    @Override
    public void stop() {
	System.out.println("In stop() method");
    }
}
