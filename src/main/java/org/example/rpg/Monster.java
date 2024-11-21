package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.damage = damage;
        this.hitPoints = hitPoints;
    }


    public int getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }
    public double attack(){
     return   getDamage();
    }



}