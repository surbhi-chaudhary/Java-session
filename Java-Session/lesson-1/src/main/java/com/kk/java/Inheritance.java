/**
 * @author KK
 * @version 1.0
 */

package com.kk.java;

public class Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog("ceaser");
        dog.eat();
        dog.bark();
    }
}


class Animal {
    protected String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {

    public Dog(String name){
        super();
        super.name = name;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog Derived Class "+name+" is eating");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }


}

