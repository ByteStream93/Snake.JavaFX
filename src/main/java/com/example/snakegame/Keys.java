package com.example.snakegame;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Keys {

   public static int direction = KeyCode.DOLLAR.getCode();

   public static int downArrowCode = KeyCode.DOWN.getCode();
   public static int upArrowCode = KeyCode.UP.getCode();
   public static int leftArrowCode = KeyCode.LEFT.getCode();
   public static int rightArrowCode = KeyCode.RIGHT.getCode();

   public static void keyWatch(KeyEvent event){

      if(event.getCode()==KeyCode.UP){
         for(int i = 0; i<1;i++) {
            Main.snake.get(i).setY_coordinate(Main.snake.get(i).getY_coordinate() - 1);
         }
      }

   }


}
