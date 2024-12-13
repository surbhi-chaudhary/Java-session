/**
 * @author KK
 * @version 1.0
 */

package com.kk.java;

class Animal{
    Animal(){
        System.out.println("It's Animal");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("It's a Dog");
    }
    @Override
    public String toString() {
        return "This is a dog object";
    }
}

public class Puzzle {
    public static void main(String[] args) {
        var dog = new Dog();
        System.out.println(dog);
    }

}
