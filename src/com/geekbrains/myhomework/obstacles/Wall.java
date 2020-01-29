package com.geekbrains.myhomework.obstacles;

import com.geekbrains.myhomework.competitors.Competition;

public class Wall extends Obstacle {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public void justDoIt(Competition competition) {
        competition.jump(height);
    }
}
