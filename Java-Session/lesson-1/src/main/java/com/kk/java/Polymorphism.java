/**
 * @author KK
 * @version 1.0
 */

package com.kk.java;

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();  // Calls draw() method of Circle class
        shape2.draw();  // Calls draw() method of Rectangle class
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}


