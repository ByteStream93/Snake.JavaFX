package com.example.snakegame;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Keys {

   public static int direction;

   public static int downArrowCode = KeyCode.DOWN.getCode();
   public static int upArrowCode = KeyCode.UP.getCode();
   public static int leftArrowCode = KeyCode.LEFT.getCode();
   public static int rightArrowCode = KeyCode.RIGHT.getCode();

   public static void keyWatch(KeyEvent event){

      if(event.getCode()==KeyCode.UP){
         if(direction != KeyCode.DOWN.getCode()){
            direction = KeyCode.UP.getCode();
         }
         if(direction != KeyCode.UP.getCode()){
            direction = KeyCode.DOWN.getCode();
         }
         if(direction != KeyCode.LEFT.getCode()){
            direction = KeyCode.RIGHT.getCode();
         }
         if(direction != KeyCode.RIGHT.getCode()){
            direction = KeyCode.LEFT.getCode();
         }
      }

   }


}
