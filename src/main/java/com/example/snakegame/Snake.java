package com.example.snakegame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Tab;
import javafx.scene.paint.Color;

public class Snake {

public int x_coordinate;
public int y_coordinate;

Snake(int x_coordinate,int y_coordinate){
    this.x_coordinate = x_coordinate;
    this.y_coordinate = y_coordinate;

}

public static void drawSnake(GraphicsContext graphicsContext){

    for(int i = 0; i<Main.snake.size();i++){
        if(i!=0){
            graphicsContext.setFill(Color.BLUE);
        }else{
            graphicsContext.setFill(Color.SKYBLUE);
        }
        graphicsContext.fillRect(Main.snake.get(i).x_coordinate* Table.getFieldsize(),Main.snake.get(i).y_coordinate* Table.getFieldsize(),Table.getFieldsize(),Table.getFieldsize());
    }
}

    public int getX_coordinate() {
        return x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }
}
