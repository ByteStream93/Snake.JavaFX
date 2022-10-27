package com.example.snakegame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    GraphicsContext graphicsContext;
    private final static int rows = 20;
    private final static int columns = 20;
    private final static int fieldsize = 800 / 20;

    @Override
    public void start(Stage primaryStage) {

        Group gameGroup = new Group();
        Canvas gameCanvas = new Canvas(800, 800);
        gameGroup.getChildren().add(gameCanvas);
        Scene gameScene = new Scene(gameGroup);
        graphicsContext = gameCanvas.getGraphicsContext2D();



        primaryStage.setTitle("Snake");
        primaryStage.setScene(gameScene);
        primaryStage.show();
        drawTable(graphicsContext);

    }





    public void drawTable(GraphicsContext graphicsContext) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if ((i+j) % 2 == 0){
                    graphicsContext.setFill(Color.GREEN);
                } else {
                    graphicsContext.setFill(Color.DARKGREEN);
                }
                graphicsContext.fillRect(i*fieldsize,j*fieldsize,fieldsize,fieldsize);
            }
        }


    }
}
