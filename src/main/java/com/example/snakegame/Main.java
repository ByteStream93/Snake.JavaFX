package com.example.snakegame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static GraphicsContext graphicsContext;
    public static int currentDirection = 0;

    public static ArrayList<Snake> snake = new ArrayList<>() {{
        add(0, new Snake(10, 10));
        add(1, new Snake(10, 11));
        add(2, new Snake(10, 12));
    }};


    @Override
    public void start(Stage primaryStage) {

        Group gameGroup = new Group();
        Canvas gameCanvas = new Canvas(800, 800);
        gameGroup.getChildren().add(gameCanvas);
        Scene gameScene = new Scene(gameGroup);
        graphicsContext = gameCanvas.getGraphicsContext2D();
        gameScene.setOnKeyPressed(event -> {
            if(KeyCode.UP == event.getCode() && currentDirection != 1){
                currentDirection = 0;
            }
            if(KeyCode.DOWN == event.getCode() && currentDirection != 0){
                currentDirection = 1;
            }
            if(KeyCode.RIGHT == event.getCode() && currentDirection != 3){
                currentDirection = 2;
            }
            if(KeyCode.LEFT == event.getCode() && currentDirection != 2){
                currentDirection = 3;
            }

        });

        primaryStage.setTitle("Snake");
        primaryStage.setScene(gameScene);
        primaryStage.show();
        Food.generateFood();
        Refresher.refresh.start();

    }


}

