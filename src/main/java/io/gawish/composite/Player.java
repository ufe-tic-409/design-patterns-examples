package io.gawish.composite;

public class Player {
    private String name;
    private Bag bag;

    public Player(String name) {
        this.name = name;
        this.bag = new Bag();
    }

    public void addInBag(Item item) {
        this.bag.addItem(item);
    }

    public int getLoad() {
        return this.bag.getWeight();
    }
}
