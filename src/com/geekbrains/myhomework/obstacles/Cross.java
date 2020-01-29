package com.geekbrains.myhomework.obstacles;

import com.geekbrains.myhomework.competitors.Competition;

public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void justDoIt(Competition competition) {
        competition.run(length);
    }
}
