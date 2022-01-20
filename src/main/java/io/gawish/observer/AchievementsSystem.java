package io.gawish.observer;

public class AchievementsSystem implements Observer {
    private static AchievementsSystem instance = null;

    private AchievementsSystem() {}

    public static AchievementsSystem getInstance() {
        if (instance == null) {
            instance = new AchievementsSystem();
        }
        return instance;
    }

    private boolean hasFellIntoOblivion = false;

    public void unlockFellIntoOblivion() {
        if (!hasFellIntoOblivion) {
            System.out.println("Congrats! You just had you first fall into oblivion");
            this.hasFellIntoOblivion = true;
        }
    }

    public void onNotify(String event) {
        if (event.compareTo("PLAYER_FALL") == 0) {
            this.unlockFellIntoOblivion();
        }
    }
}