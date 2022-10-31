package com.example.snakegame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Food {

    public static int real_x;
    public static int real_y;
    public static int value_x;
    public static int value_y;

    public static void generateFood(){

        real_x = (int) (Math.random()*Table.getRows());
        real_y = (int) (Math.random()*Table.getColumns());

        value_x = real_x*Table.getFieldsize();
        value_y = real_y*Table.getFieldsize();

        for(int i = 0; i<Main.snake.size();i++){
            if(real_x == Main.snake.get(i).getX_coordinate() && real_y == Main.snake.get(i).getY_coordinate()){
                generateFood();
            }
        }
    }

    public static void drawFood(GraphicsContext graphicsContext){
        graphicsContext.setFill(Color.RED);
        graphicsContext.fillRect(value_x,value_y,Table.getFieldsize(),Table.getFieldsize());
    }

}
