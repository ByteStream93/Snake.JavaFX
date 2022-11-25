package com.example.snakegame;

import javafx.animation.AnimationTimer;

public class Refresher {


    public static AnimationTimer refresh = new AnimationTimer() {
        private long lastUpdate = 0;
        @Override
        public void handle(long now) {
            if(now-lastUpdate >= 66666666 ){
                Actions.tick();
                lastUpdate = now;
            }
        }
    };
}
