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



    public int getX_coordinate() {
        return x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public void setX_coordinate(int x_coordinateNew) {
        x_coordinate = x_coordinateNew;
    }

    public void setY_coordinate(int y_coordinateNew) {
        y_coordinate = y_coordinateNew;
    }

    public static void moveHead(){
    switch  (Main.currentDirection){

        case 0:
        Main.snake.get(0).setY_coordinate(Main.snake.get(0).getY_coordinate()-1);
        break;

        case 1:
        Main.snake.get(0).setY_coordinate(Main.snake.get(0).getY_coordinate()+1);
        break;

        case 2:
            Main.snake.get(0).setX_coordinate(Main.snake.get(0).getX_coordinate()+1);
            break;

        case 3:
            Main.snake.get(0).setX_coordinate(Main.snake.get(0).getX_coordinate()-1);
            break;
    }
    }

    }



