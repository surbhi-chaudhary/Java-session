/**
 * @author KK
 * @version 1.0
 */

package com.kk.java.homework;

interface ShippingStrategyV2 {
    double calculateShippingCost(double weight);
}

class StandardShippingV2 implements ShippingStrategyV2 {
    //flatRate represents a fixed cost that is charged for shipping, regardless of the weight of the package.
    private static final double FLAT_RATE = 50.0;
    //ratePerKg represents the cost per kilogram of the package weight.
    private static final double RATE_PER_KG = 10.0;
    // totalCost = flatRate + (weight * ratePerKg)

    @Override
    public double calculateShippingCost(double weight) {
        return FLAT_RATE + (weight * RATE_PER_KG);
    }
}

class ExpressShippingV2 implements ShippingStrategyV2 {
    private static final double FLAT_RATE = 100.0;
    private static final double RATE_PER_KG = 20.0;

    @Override
    public double calculateShippingCost(double weight) {
        return FLAT_RATE + (weight * RATE_PER_KG);
    }
}

class PriorityShippingV2 implements ShippingStrategyV2 {
    private static final double FLAT_RATE = 150.0;
    private static final double RATE_PER_KG = 30.0;

    @Override
    public double calculateShippingCost(double weight) {
        return FLAT_RATE + (weight * RATE_PER_KG);
    }
}

class ShippingCalculatorV2 {
    private final ShippingStrategyV2 shippingStrategy;

    public ShippingCalculatorV2(ShippingStrategyV2 shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(double weight) {
        return shippingStrategy.calculateShippingCost(weight);
    }
}



// Main.java
public class Solution2 {
    public static void main(String[] args) {
        ShippingStrategyV2 standardShipping = new StandardShippingV2();
        ShippingStrategyV2 expressShipping = new ExpressShippingV2();
        ShippingStrategyV2 priorityShipping = new PriorityShippingV2();

        // Create instances of ShippingCalculator with different strategies
        ShippingCalculatorV2 calculator1 = new ShippingCalculatorV2(standardShipping);
        ShippingCalculatorV2 calculator2 = new ShippingCalculatorV2(expressShipping);
        ShippingCalculatorV2 calculator3 = new ShippingCalculatorV2(priorityShipping);

        // Calculate shipping costs for different package weights
        double packageWeight1 = 2.5;
        double packageWeight2 = 5.0;
        double packageWeight3 = 7.8;

        System.out.println("Shipping Costs:");
        System.out.println("Standard Shipping:");
        System.out.println("Package Weight: " + packageWeight1 + " kg, Cost: ₹" + calculator1.calculateShippingCost(packageWeight1));
        System.out.println("Package Weight: " + packageWeight2 + " kg, Cost: ₹" + calculator1.calculateShippingCost(packageWeight2));
        System.out.println("Package Weight: " + packageWeight3 + " kg, Cost: ₹" + calculator1.calculateShippingCost(packageWeight3));

        System.out.println("\nExpress Shipping:");
        System.out.println("Package Weight: " + packageWeight1 + " kg, Cost: ₹" + calculator2.calculateShippingCost(packageWeight1));
        System.out.println("Package Weight: " + packageWeight2 + " kg, Cost: ₹" + calculator2.calculateShippingCost(packageWeight2));
        System.out.println("Package Weight: " + packageWeight3 + " kg, Cost: ₹" + calculator2.calculateShippingCost(packageWeight3));

        System.out.println("\nPriority Shipping:");
        System.out.println("Package Weight: " + packageWeight1 + " kg, Cost: ₹" + calculator3.calculateShippingCost(packageWeight1));
        System.out.println("Package Weight: " + packageWeight2 + " kg, Cost: ₹" + calculator3.calculateShippingCost(packageWeight2));
        System.out.println("Package Weight: " + packageWeight3 + " kg, Cost: ₹" + calculator3.calculateShippingCost(packageWeight3));
    }
}

