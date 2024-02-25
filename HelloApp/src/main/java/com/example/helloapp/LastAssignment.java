package com.example.helloapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LastAssignment extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        HBox topMenu = new HBox();
        topMenu.getChildren().addAll(createButton("File"), createButton("Edit"), createButton("View"));
        borderPane.setTop(topMenu);

        VBox leftMenu = new VBox();
        leftMenu.getChildren().addAll(createButton("D"), createButton("E"), createButton("F"));
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setTitle("Arjab Last Assignment");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createButton(String text) {
        return new Button(text);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
