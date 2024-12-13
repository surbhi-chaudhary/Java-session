/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.strategy.weapon.impl;

import com.kk.java.strategy.weapon.Weapon;

public class Sword extends Weapon {
    public Sword() {
        super("Sword");
    }

    @Override
    public void attack() {
        System.out.println("Attacking with a sword!");
    }
}