package com.example.snakegame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Table {

    private final static int rows = 20;
    private final static int columns = 20;
    private final static int fieldsize = 800 / 20;


    public static void drawTable(GraphicsContext graphicsContext) {
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

    public static int getRows() {
        return rows;
    }

    public static int getFieldsize() {
        return fieldsize;
    }

    public static int getColumns() {
        return columns;
    }
}
