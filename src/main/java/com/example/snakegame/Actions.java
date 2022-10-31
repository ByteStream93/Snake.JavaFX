package com.example.snakegame;

public class Actions {
    static int direction = Keys.downArrowCode;
    public static void checkEat(){
        if(Main.snake.get(0).getX_coordinate() == Food.real_x && Main.snake.get(0).getY_coordinate() == Food.value_y){
            Main.snake.add(Main.snake.size(),new Snake(Food.real_x,Food.real_y));
            Food.generateFood();
        }
    }
    public static void moveHead(){
        if(direction == Keys.downArrowCode){
            for(int i = 0; i<Main.snake.size();i++){
                Main.snake.set(0)
            }
        }
    }

}
