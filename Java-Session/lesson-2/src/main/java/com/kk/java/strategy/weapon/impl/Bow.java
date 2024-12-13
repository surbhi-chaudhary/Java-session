/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.strategy.weapon.impl;

import com.kk.java.strategy.weapon.Weapon;

public class Bow extends Weapon {
    public Bow() {
        super("Bow");
    }

    @Override
    public void attack() {
        System.out.println("Attacking with a bow and arrow!");
    }
}
