package com.geekbrains.myhomework.competitors;

public class Cat implements Competition {

    private boolean isInvolved;
    private double maxRunRange;
    private double maxJumpHeight;
    private String name;

    public Cat(String name, double maxRunRange, double maxJumpHeight) {
        this.name = name;
        this.maxRunRange = maxRunRange;
        this.maxJumpHeight = maxJumpHeight;
        this.isInvolved = true;
    }

    @Override
    public void run(double dist) {
        if (dist <= maxRunRange) {
            System.out.println("Кот " + name + " успешно пробежал дистанцию!");
        } else {
            System.out.println("Кот " + name + " провалил тест на бег и пошел отдыхать!");
            isInvolved = false;
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Кот " + name + " успешно перепрыгнул!");
        } else {
            System.out.println("Кот " + name + " провалил тест на прыжок и пошел отдыхать!");
            isInvolved = false;
        }
    }

    @Override
    public boolean onDistance() {
        return isInvolved;
    }
}
