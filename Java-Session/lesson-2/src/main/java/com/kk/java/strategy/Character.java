/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.strategy;

import com.kk.java.strategy.weapon.Weapon;

public class Character {
    private final AttackStrategy attackStrategy;

    public Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void displayWeaponName() {
        if (attackStrategy instanceof Weapon) {
            ((Weapon) attackStrategy).displayWeaponName();
        }
    }
}

