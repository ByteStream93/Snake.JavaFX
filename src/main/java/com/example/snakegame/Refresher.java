package com.example.snakegame;

import javafx.animation.AnimationTimer;

public class Refresher {


    public static AnimationTimer refresh = new AnimationTimer() {
        
        private long lastUpdate = 0;
        
        @Override
        public void handle(long now) {
            if(now-lastUpdate >= 99999999){
                Actions.tick();
                lastUpdate = now;
            }

        }
    };
}
