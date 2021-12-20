package io.gawish.bridge;

public class FighterAggressive extends Fighter {
    @Override
    public void attack() {
        this.swordAttack();
        this.swordAttack();
    }

    @Override
    public void charge() {
        this.chargeTheEnemy();
        this.chargeTheEnemy();
    }

    @Override
    public void hide() {
        this.attemptToHide();
    }

    @Override
    public void heal() {
        this.swordAttack();
        this.healWithHerbs();
    }
}