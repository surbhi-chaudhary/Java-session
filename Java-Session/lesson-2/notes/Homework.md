# Java Tutorial - Session 2 Homework

* Created: March 13, 2024 9:55 AM
* Last Edited Time: March 13, 2024 10:20 AM
* Type: Java
* Created By: Kishore Karunakaran
* Last Edited By: Kishore Karunakaran

# HomeWork : Shipping Cost Calculator

## Objective:

Implement a shipping cost calculator using the Strategy design pattern in Java. The calculator should allow users to calculate shipping costs based on different shipping strategies, such as standard shipping, express shipping, and priority shipping.

## Requirements:

1. Create an interface named `ShippingStrategy` with a method `calculateShippingCost(double weight)` that takes the weight of the package as a parameter and returns the calculated shipping cost.
2. Implement three concrete classes that implement the `ShippingStrategy` interface:
    - `StandardShipping`: Calculates the shipping cost based on a flat rate of ₹50 plus ₹10 per kilogram.
    - `ExpressShipping`: Calculates the shipping cost based on a flat rate of ₹100 plus ₹20 per kilogram.
    - `PriorityShipping`: Calculates the shipping cost based on a flat rate of ₹150 plus ₹30 per kilogram.
3. Create a class named `ShippingCalculator` with the following:
    - An instance variable of type `ShippingStrategy`.
    - A constructor that accepts a `ShippingStrategy` object as a parameter and initializes the instance variable.
    - A method named `calculateShippingCost(double weight)` that delegates the calculation to the `ShippingStrategy` object.
4. Implement a main class named `Main` that demonstrates the usage of the `ShippingCalculator` with different shipping strategies:
    - Create instances of `StandardShipping`, `ExpressShipping`, and `PriorityShipping`.
    - Create instances of `ShippingCalculator` using each shipping strategy.
    - Calculate and display the shipping costs for packages with different weights using each shipping strategy.
5. Ensure that your code follows the principles of the Strategy design pattern, where the shipping cost calculation algorithm is encapsulated within each shipping strategy class, and the `ShippingCalculator` is unaware of the specific implementation details.
6. Test your code with different package weights and shipping strategies to ensure accurate shipping cost calculations.
7. Document your code with appropriate comments explaining the purpose and functionality of each class and method.

## Bonus:

- Add a new shipping strategy named `FreeShipping` that provides free shipping for packages weighing less than 1 kilogram. Integrate this strategy into your existing code.

## Submission:

1. Include a brief report explaining your design decisions, any challenges you faced, and how you resolved them.
2If you completed any bonus tasks, mention them in your report and provide the corresponding code.

Evaluation Criteria:

- Correctness of the implementation and adherence to the Strategy design pattern.
- Code readability, structure, and documentation.
- Completion of bonus tasks (if attempted).

# Summary:

This homework assignment will give you hands-on experience in implementing the Strategy design pattern, encapsulating algorithms, and promoting flexibility in your code. It will also help you understand how to design and structure your code to accommodate different strategies and make them interchangeable.