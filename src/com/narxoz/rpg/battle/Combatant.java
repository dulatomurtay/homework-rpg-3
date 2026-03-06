package com.narxoz.rpg.battle;

public interface Combatant {
    String getName();
    int getAttackPower();
    void takeDamage(int damage);
    boolean isAlive();
}
