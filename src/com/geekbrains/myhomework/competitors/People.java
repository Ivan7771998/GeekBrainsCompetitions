package com.geekbrains.myhomework.competitors;

import javax.swing.plaf.SplitPaneUI;

public class People implements Competition {

    private boolean isInvolved;
    private double maxRunRange;
    private double maxJumpHeight;
    private String name;

    public People(String name, double maxRunRange, double maxJumpHeight) {
        this.name = name;
        this.maxRunRange = maxRunRange;
        this.maxJumpHeight = maxJumpHeight;
        this.isInvolved = true;
    }

    @Override
    public void run(double dist) {
        if (dist <= maxRunRange) {
            System.out.println(name + " успешно пробежал дистанцию!");
        } else {
            System.out.println(name + " провалил тест на бег и пошел отдыхать!");
            isInvolved = false;
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул!");
        } else {
            System.out.println(name + " провалил тест на прыжок и пошел отдыхать!");
            isInvolved = false;
        }
    }

    @Override
    public boolean onDistance() {
        return isInvolved;
    }
}
