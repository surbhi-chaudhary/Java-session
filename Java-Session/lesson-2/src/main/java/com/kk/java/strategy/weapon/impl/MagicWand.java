/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.strategy.weapon.impl;

import com.kk.java.strategy.weapon.Weapon;

public class MagicWand extends Weapon {
    public MagicWand() {
        super("Magic Wand");
    }

    @Override
    public void attack() {
        System.out.println("Attacking with magic spell!");
    }
}

