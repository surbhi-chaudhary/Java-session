/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.abstractclass;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}