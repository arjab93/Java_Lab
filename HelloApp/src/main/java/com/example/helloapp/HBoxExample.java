package com.example.helloapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Arjab Button 1");
        Button btn2 = new Button("Arjab Button 2");

        HBox root = new HBox();
        Scene scene = new Scene(root, 200, 200);
        root.getChildren().addAll(btn1, btn2);

        primaryStage.setTitle("Arjab HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
