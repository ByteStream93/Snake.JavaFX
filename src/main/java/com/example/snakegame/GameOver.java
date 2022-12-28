package com.example.snakegame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GameOver {

    public static void end(GraphicsContext graphicsContext){
        int endDrawing = 0;
        
        if(Main.snake.get(0).x_coordinate > Table.getColumns()-1 || Main.snake.get(0).x_coordinate < 0){
            
            Refresher.refresh.stop();
            endDrawing = 1;
            
        }
        if(Main.snake.get(0).y_coordinate > Table.getRows()-1 || Main.snake.get(0).y_coordinate < 0){
            Refresher.refresh.stop();
            
            endDrawing = 1;
        }
        
        for (int i = 2; i < Main.snake.size(); i++){
        if(Main.snake.get(i).x_coordinate==Main.snake.get(0).x_coordinate && Main.snake.get(i).y_coordinate==Main.snake.get(0).y_coordinate){
            
            Refresher.refresh.stop();
            endDrawing = 1;
         }
        }
        if (endDrawing==1){
            graphicsContext.setFont(Font.font(140));
            graphicsContext.setStroke(Color.WHITE);
            graphicsContext.strokeText("YOU DIED!",2*Table.getFieldsize(),11*Table.getFieldsize());
        }
    }

}
