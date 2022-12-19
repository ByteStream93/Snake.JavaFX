package com.example.snakegame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Counter {
    
    public static int points = 0;
    
    public static void count(GraphicsContext graphicsContext){
        
        graphicsContext.setFont(Font.font(20));
        graphicsContext.setStroke(Color.WHITE);
        graphicsContext.strokeText("Count: "+ points,17.6*Table.getFieldsize(),0.65*Table.getFieldsize());
    }
}
