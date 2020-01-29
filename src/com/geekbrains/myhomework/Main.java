package com.geekbrains.myhomework;

import com.geekbrains.myhomework.competitors.Cat;
import com.geekbrains.myhomework.competitors.Competition;
import com.geekbrains.myhomework.competitors.People;
import com.geekbrains.myhomework.competitors.Robot;
import com.geekbrains.myhomework.obstacles.Cross;
import com.geekbrains.myhomework.obstacles.Obstacle;
import com.geekbrains.myhomework.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Competition[] competitors ={
                new People("Vanya", 2500, 5),
                new People("Vladimir", 2000,1),
                new People("Timur", 1500,4),
                new People("Mike", 3000,7),
                new Cat("Barsik",2000,5),
                new Cat("Markiz",2500,4),
                new Cat("Roma",3200,6),
                new Cat("Misha",2000,5),
                new Robot("Petr", 5000,8),
                new Robot("Vasya", 3400,8),
                new Robot("Dima", 1000,2),
                new Robot("Robocop", 3000,3),
        };
        Obstacle[] obstacles ={
                new Wall(5),
                new Cross(2500)
        };
        for (Competition c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.justDoIt(c);
                if(!c.onDistance()){
                    break;
                }
            }
        }
    }
}
