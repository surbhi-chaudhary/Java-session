/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        circle.draw();  // Output: Drawing a circle.
        rectangle.draw();  // Output: Drawing a rectangle.
    }
}


class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
