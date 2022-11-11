package com.example.snakegame;

import javafx.scene.canvas.GraphicsContext;


public class Actions {

    public static GraphicsContext graphicsContext;

    static int direction = Keys.direction;
    public static void checkEat(){
        if(Main.snake.get(0).getX_coordinate() == Food.real_x && Main.snake.get(0).getY_coordinate() == Food.value_y){
            Main.snake.add(Main.snake.size(),new Snake(Food.real_x,Food.real_y));
            Food.generateFood();
        }
    }
    public static void snakeMovement(){
        Snake.moveHead();
        Snake.moveSnakeBody();
        Snake.drawSnake(graphicsContext);
    }

}
