package com.example.snakegame;

public class Actions {




    public static void checkEat(){
        
        if(Main.snake.get(0).getX_coordinate() == Food.real_x && Main.snake.get(0).getY_coordinate() == Food.real_y){
            
            Main.snake.add(Main.snake.size(),new Snake(Food.real_x,Food.real_y));
            Food.generateFood();
            Counter.points++;
        }
    }
    public static void snakeActions() {
        
        Snake.moveSnakeBody();
        Snake.drawSnakeBody(Main.graphicsContext);
        Snake.drawSnakeHead(Main.graphicsContext);
        Snake.moveHead();
    }

    public static void tick() {
        
        Table.drawTable(Main.graphicsContext);
        Food.drawFood(Main.graphicsContext);
        Actions.checkEat();
        Actions.snakeActions();
        Counter.count(Main.graphicsContext);
        GameOver.end(Main.graphicsContext);
    }
}
