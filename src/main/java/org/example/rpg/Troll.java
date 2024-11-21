package org.example.rpg;

public class Troll extends Monster implements Poisonable, Bleedable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public int getHitPoints() {
        return super.getHitPoints();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getDamage() {
        return super.getDamage();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}
