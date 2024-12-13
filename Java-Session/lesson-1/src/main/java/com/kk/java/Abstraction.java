/**
 * @author KK
 * @version 1.0
 */

package com.kk.java;

public class Abstraction {

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.start();  // Calls start() method of Car class
    }
}

abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " car is starting.");
    }
}

// Your Home work is write an Bike class which extends the Vehicle
// Understand what is abstract class in Java with bit more details.