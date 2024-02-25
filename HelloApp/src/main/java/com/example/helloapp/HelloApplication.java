package com.example.helloapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Arjab");
        stage.setScene(scene);
        stage.show();
    }


//@Override
//public void start(Stage primaryStage) {
    // Choose the example you want to run
    // Uncomment only one of the following lines at a time:

    // Example 1: FlowPane
//    new FlowPaneExample().start(primaryStage);

    // Example 2: HBox
//     new HBoxExample().start(primaryStage);

    // Example 3: GridPane
//     new GridPaneExample().start(primaryStage);

    // Example 4: Last Assignment
    // new LastAssignment().start(primaryStage);
//}

    public static void main(String[] args) {
        launch();
    }
}