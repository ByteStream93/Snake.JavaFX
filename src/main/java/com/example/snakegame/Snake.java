package com.example.snakegame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Tab;
import javafx.scene.paint.Color;

public class Snake {

public static int x_coordinate;
public static int y_coordinate;

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

    public void setX_coordinate(int x_coordinateNew) {
        x_coordinate = x_coordinateNew;
    }

    public void setY_coordinate(int y_coordinateNew) {
        y_coordinate = y_coordinateNew;
    }

    public static void moveHead(){
        if(Actions.direction == Keys.downArrowCode){
            for(int i = 0; i<1;i++){
                Main.snake.get(i).setY_coordinate(Main.snake.get(i).getY_coordinate()+1);
            }
        }
        if(Actions.direction == Keys.upArrowCode){
            for(int i = 0; i<1;i++){
                Main.snake.get(i).setY_coordinate(Main.snake.get(i).getY_coordinate()-1);
            }
        }
        if(Actions.direction == Keys.leftArrowCode){
            for(int i = 0; i<1;i++){
                Main.snake.get(i).setY_coordinate(Main.snake.get(i).getY_coordinate()-1);
            }
        }
        if(Actions.direction == Keys.rightArrowCode){
            for(int i = 0; i<1;i++){
                Main.snake.get(i).setY_coordinate(Main.snake.get(i).getY_coordinate()+1);
            }
        }
    }
    public static void moveSnakeBody(){
        for (int i = Main.snake.size();i>0;i--){
            if(i>1){
            int actualized_x = Main.snake.get(i-1).getX_coordinate();
            int actualized_y = Main.snake.get(i-1).getY_coordinate();
            Main.snake.get(i).setX_coordinate(actualized_x);
            Main.snake.get(i).setY_coordinate(actualized_y);
            }/*else{
                int actualized_x = Main.snake.get(0).getX_coordinate();
                int actualized_y = Main.snake.get(0).getY_coordinate();
                Main.snake.get(i).setX_coordinate(actualized_x);
                Main.snake.get(i).setY_coordinate(actualized_y);
            }*/
    }
}
}
