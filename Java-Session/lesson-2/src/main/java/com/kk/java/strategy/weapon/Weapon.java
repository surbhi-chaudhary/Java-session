/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.strategy.weapon;

import com.kk.java.strategy.AttackStrategy;

public abstract class Weapon implements AttackStrategy {
    protected String weaponName;

    public Weapon(String weaponName) {
        this.weaponName = weaponName;
    }

    public abstract void attack();

    public void displayWeaponName() {
        System.out.println("Weapon: " + weaponName);
    }
}