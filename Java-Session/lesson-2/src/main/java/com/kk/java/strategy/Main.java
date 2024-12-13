/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.strategy;

import com.kk.java.strategy.weapon.impl.Bow;
import com.kk.java.strategy.weapon.impl.MagicWand;
import com.kk.java.strategy.weapon.impl.Sword;

public class Main {
    public static void main(String[] args) {
        Character swordCharacter = new Character(new Sword());
        swordCharacter.displayWeaponName(); // Output: Weapon: Sword
        swordCharacter.attack(); // Output: Attacking with a sword!

        Character bowCharacter = new Character(new Bow());
        bowCharacter.displayWeaponName(); // Output: Weapon: Bow
        bowCharacter.attack(); // Output: Attacking with a bow and arrow!

        Character magicCharacter = new Character(new MagicWand());
        magicCharacter.displayWeaponName(); // Output: Weapon: Magic Wand
        magicCharacter.attack(); // Output: Attacking with magic spell!
    }
}
