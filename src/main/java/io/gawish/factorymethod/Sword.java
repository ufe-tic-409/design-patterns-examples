package io.gawish.factorymethod;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("Sword swings");
    }
}
