package io.gawish.observer;

import java.util.Scanner;

public class Runner {
    public static void run() {
        Player p1 = new Player("P1");
        Scanner input = new Scanner(System.in);

//        PhysicsSystem.getInstance().addObserver(AudioSystem.getInstance());
//        PhysicsSystem.getInstance().addObserver(AchievementsSystem.getInstance());
        PhysicsSystem.getInstance().playerFall().addObserver(AudioSystem.getInstance());
        PhysicsSystem.getInstance().playerFall().addObserver(AchievementsSystem.getInstance());

        while (true) {
            System.out.println(p1);
            String pressed = input.nextLine();
            System.out.println("Pressed: ".concat(pressed));

            if (pressed.compareTo("d") == 0) {
                p1.stepX();
            }

            PhysicsSystem.getInstance().update(p1);
        }
    }
}