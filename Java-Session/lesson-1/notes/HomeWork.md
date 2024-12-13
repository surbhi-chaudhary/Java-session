### HomeWork

#### Exercise 1: Shape Interface
1. Create an interface called `Shape` with the following methods:
    - `double getArea()`: Returns the area of the shape.
    - `double getPerimeter()`: Returns the perimeter of the shape.
2. Implement the `Shape` interface in two classes: `Circle` and `Rectangle`.
    - For the `Circle` class, provide a constructor that takes the radius as a parameter and implement the `getArea()` and `getPerimeter()` methods.
    - For the `Rectangle` class, provide a constructor that takes the width and height as parameters and implement the `getArea()` and `getPerimeter()` methods.
3. Create a `Main` class with a `main()` method to test your implementation. Create instances of `Circle` and `Rectangle`, and display their area and perimeter.

#### Exercise 2: Animal Abstract Class
1. Create an abstract class called `Animal` with the following:
    - An abstract method `void makeSound()`.
    - A concrete method `void eat()` that prints a message indicating the animal is eating.
2. Create two subclasses of `Animal`: `Cat` and `Dog`.
    - Implement the `makeSound()` method in each subclass to print the appropriate sound (e.g., "Meow" for cats and "Woof" for dogs).
    - Add a specific method to each subclass: `void scratch()` for `Cat` and `void fetch()` for `Dog`.
3. Create a `Main` class with a `main()` method to test your implementation. Create instances of `Cat` and `Dog`, call their `makeSound()`, `eat()`, and specific methods.

#### Exercise 3: Payable Interface
1. Create an interface called `Payable` with a method `double getPaymentAmount()`.
2. Create two classes: `Employee` and `Contractor`, both implementing the `Payable` interface.
    - For the `Employee` class, provide a constructor that takes the employee's name and monthly salary as parameters. Implement the `getPaymentAmount()` method to return the monthly salary.
    - For the `Contractor` class, provide a constructor that takes the contractor's name and hourly rate as parameters. Implement the `getPaymentAmount()` method to return the payment amount based on a fixed number of hours (e.g., 40 hours).
3. Create a `Main` class with a `main()` method to test your implementation. Create instances of `Employee` and `Contractor`, and display their payment amounts.

#### Exercise 4: Vehicle Abstract Class and Interface
1. Create an abstract class called `Vehicle` with the following:
    - An abstract method `void startEngine()`.
    - A concrete method `void stopEngine()` that prints a message indicating the engine is stopped.
2. Create an interface called `Drivable` with two methods: `void accelerate()` and `void brake()`.
3. Create two classes: `Car` and `Motorcycle`, both extending the `Vehicle` class and implementing the `Drivable` interface.
    - Implement the `startEngine()`, `accelerate()`, and `brake()` methods in each class to print appropriate messages.
    - Add a specific method to each class: `void openDoors()` for `Car` and `void putOnHelmet()` for `Motorcycle`.
4. Create a `Main` class with a `main()` method to test your implementation. Create instances of `Car` and `Motorcycle`, call their methods inherited from `Vehicle`, and call the methods from the `Drivable` interface.

These exercises will help you practice designing and implementing interfaces and abstract classes in Java. They cover different scenarios and demonstrate how to use these concepts to define common behaviors and create hierarchical relationships between classes.