package io.gawish.factorymethod;

public class Zombie implements Monster {
    @Override
    public void collectFood() {
        System.out.println("Zombie is collecting brains");
    }

    @Override
    public void attack() {
        System.out.println("Zombie attempts to attack nearest human");
    }

    @Override
    public void build() {
        System.out.println("Zombie is digging a cemetery");
    }
}
