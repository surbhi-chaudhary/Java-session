/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.homework;

interface ShippingStrategy {
    double calculateShippingCost(double weight);
}

abstract class ShippingMethod implements ShippingStrategy {
    protected String name;

    //flatRate represents a fixed cost that is charged for shipping, regardless of the weight of the package.
    protected double flatRate;

    //ratePerKg represents the cost per kilogram of the package weight.
    protected double ratePerKg;

    // totalCost = flatRate + (weight * ratePerKg)

    public ShippingMethod(String name, double flatRate, double ratePerKg) {
        this.name = name;
        this.flatRate = flatRate;
        this.ratePerKg = ratePerKg;
    }

    public String getName() {
        return name;
    }
}

class StandardShipping extends ShippingMethod {
    public StandardShipping() {
        super("Standard Shipping", 50.0, 10.0);
    }

    @Override
    public double calculateShippingCost(double weight) {
        return flatRate + (weight * ratePerKg);
    }
}

class ExpressShipping extends ShippingMethod {
    public ExpressShipping() {
        super("Express Shipping", 100.0, 20.0);
    }

    @Override
    public double calculateShippingCost(double weight) {
        return flatRate + (weight * ratePerKg);
    }
}

class PriorityShipping extends ShippingMethod {
    public PriorityShipping() {
        super("Priority Shipping", 150.0, 30.0);
    }

    @Override
    public double calculateShippingCost(double weight) {
        return flatRate + (weight * ratePerKg);
    }
}

class FreeShipping extends ShippingMethod {
    private static final double MAX_WEIGHT_FOR_FREE_SHIPPING = 1.0;

    public FreeShipping() {
        super("Free Shipping", 0.0, 0.0);
    }

    @Override
    public double calculateShippingCost(double weight) {
        if (weight <= MAX_WEIGHT_FOR_FREE_SHIPPING) {
            return 0.0;
        } else {
            return flatRate + (weight * ratePerKg);
        }
    }
}

class ShippingCalculator {
    private final ShippingStrategy shippingStrategy;

    public ShippingCalculator(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(double weight) {
        return shippingStrategy.calculateShippingCost(weight);
    }

    public String getShippingMethodName() {
        if (shippingStrategy instanceof ShippingMethod) {
            return ((ShippingMethod) shippingStrategy).getName();
        }
        return "Unknown Shipping Method";
    }
}



public class Solution1 {
    public static void main(String[] args) {
        // Create instances of shipping strategies
        ShippingStrategy standardShipping = new StandardShipping();
        ShippingStrategy expressShipping = new ExpressShipping();
        ShippingStrategy priorityShipping = new PriorityShipping();

        // Create instances of ShippingCalculator with different strategies
        ShippingCalculator calculator1 = new ShippingCalculator(standardShipping);
        ShippingCalculator calculator2 = new ShippingCalculator(expressShipping);
        ShippingCalculator calculator3 = new ShippingCalculator(priorityShipping);

        // Calculate shipping costs for different package weights
        double packageWeight1 = 2.5;
        double packageWeight2 = 5.0;
        double packageWeight3 = 7.8;

        System.out.println("Shipping Costs:");
        System.out.println(calculator1.getShippingMethodName() + ":");
        System.out.println("Package Weight: " + packageWeight1 + " kg, Cost: ₹" + calculator1.calculateShippingCost(packageWeight1));
        System.out.println("Package Weight: " + packageWeight2 + " kg, Cost: ₹" + calculator1.calculateShippingCost(packageWeight2));
        System.out.println("Package Weight: " + packageWeight3 + " kg, Cost: ₹" + calculator1.calculateShippingCost(packageWeight3));

        System.out.println("\n" + calculator2.getShippingMethodName() + ":");
        System.out.println("Package Weight: " + packageWeight1 + " kg, Cost: ₹" + calculator2.calculateShippingCost(packageWeight1));
        System.out.println("Package Weight: " + packageWeight2 + " kg, Cost: ₹" + calculator2.calculateShippingCost(packageWeight2));
        System.out.println("Package Weight: " + packageWeight3 + " kg, Cost: ₹" + calculator2.calculateShippingCost(packageWeight3));

        System.out.println("\n" + calculator3.getShippingMethodName() + ":");
        System.out.println("Package Weight: " + packageWeight1 + " kg, Cost: ₹" + calculator3.calculateShippingCost(packageWeight1));
        System.out.println("Package Weight: " + packageWeight2 + " kg, Cost: ₹" + calculator3.calculateShippingCost(packageWeight2));
        System.out.println("Package Weight: " + packageWeight3 + " kg, Cost: ₹" + calculator3.calculateShippingCost(packageWeight3));
    }
}
