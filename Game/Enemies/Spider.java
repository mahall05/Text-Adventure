package Enemies;

import BaseClasses.Enemy;

public class Spider extends Enemy {

    public Spider(int level, String name){
        this.level = level;
        this.name = name;

        health = 20 + (1.5 * (level-1));
        damage = 2 + (0.25 * (level-1));
    }

    /*
    public Spider(){
        this(random number);
    }
    */

    public void attack(double damage){
        health -= damage;
    }
}
