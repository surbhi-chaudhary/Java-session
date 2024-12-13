/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.abstractclass;

public class AbstractMain {

    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.displayColor();  // Output: Color: Red
        System.out.println("Circle Area: " + circle.getArea());  // Output: Circle Area: 78.53981633974483

        rectangle.displayColor();  // Output: Color: Blue
        System.out.println("Rectangle Area: " + rectangle.getArea());  // Output: Rectangle Area: 24.0
    }
}


class Circle extends Shape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}