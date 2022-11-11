package com.example.snakegame;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    GraphicsContext graphicsContext;

    public static ArrayList<Snake> snake = new ArrayList<Snake>(){{
        add(0,new Snake(10,10));
        add(1,new Snake(10,11));
        add(2,new Snake(10,12));
    }};


    @Override
    public void start(Stage primaryStage) {

        Group gameGroup = new Group();
        Canvas gameCanvas = new Canvas(800, 800);
        gameGroup.getChildren().add(gameCanvas);
        Scene gameScene = new Scene(gameGroup);
        graphicsContext = gameCanvas.getGraphicsContext2D();
        gameCanvas.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            Keys.keyWatch(event);
            Actions.snakeMovement();
            }
        });



        primaryStage.setTitle("Snake");
        primaryStage.setScene(gameScene);
        primaryStage.show();
        Food.generateFood();
        snakeSetup();
        tick();

    }

public void tick(){
        Table.drawTable(graphicsContext);
        Food.drawFood(graphicsContext);
        Snake.drawSnake(graphicsContext);
        Actions.checkEat();
}

public void snakeSetup(){
        snake.add(0,new Snake(10,10));
}
}
