## Lambda Expression and Functional Interface

Two homework assignments on Java lambda expressions and functional interfaces, one of medium complexity and another of high complexity.

### Homework 1 (StringOperation):

1. Create a functional interface called `StringOperation` with a single abstract method `operate` that takes a string as input and returns a string.
2. Implement the following string operations using lambda expressions and the `StringOperation` interface:
    - Reverse the string
    - Convert the string to uppercase
    - Remove all whitespace from the string
3. Create a class called `StringProcessor` with a method `processString` that takes a string and a `StringOperation` as parameters. The `processString` method should apply the given operation to the string and return the result.
4. In the `main` method, create instances of the `StringProcessor` class and test the implemented string operations using lambda expressions.

### Homework 2 (NumberPredicate):

1. Create a functional interface called `NumberPredicate` with a single abstract method `test` that takes an integer as input and returns a boolean.
2. Create a class called `NumberFilter` with a method `filterNumbers` that takes a list of integers and a `NumberPredicate` as parameters. The `filterNumbers` method should return a new list containing only the numbers that satisfy the given predicate.
3. Implement the following number predicates using lambda expressions and the `NumberPredicate` interface:
    - Check if a number is prime
    - Check if a number is a perfect square
    - Check if a number is a Fibonacci number
4. Create a class called `NumberStatistics` with the following methods:
    - `average`: Takes a list of integers and returns the average value.
    - `sum`: Takes a list of integers and returns the sum of all numbers.
    - `max`: Takes a list of integers and returns the maximum value.
    - `min`: Takes a list of integers and returns the minimum value.

   Implement these methods using lambda expressions and the built-in functional interfaces (`Function`, `ToIntFunction`, `Predicate`, etc.) from the `java.util.function` package.

5. In the `main` method, create an instance of the `NumberFilter` class and test the implemented number predicates using lambda expressions. Filter a list of numbers based on each predicate and print the filtered lists.
6. In the `main` method, create an instance of the `NumberStatistics` class and test the implemented methods using lambda expressions. Calculate and print the average, sum, maximum, and minimum values of a list of numbers.


Understood, let's design homework exercises focusing on the use of functional interfaces without involving Java Collections.

### Functional Interfaces:
#### Predicate Homework

1. **Validate User Input**: Write a method that takes a string input from a user and a `Predicate<String>` to validate this input. The predicate should check if the input string meets a specific condition, e.g., is not empty and has more than 5 characters. Print a message indicating whether the input is valid.

2. **Number Analysis**: Implement a method that accepts an integer and a `Predicate<Integer>`. This method should print whether the given integer is positive, negative, or zero based on the predicate provided. Test your method with different predicates.

#### Consumer Homework

1. **Personalized Greeting**: Create a method that accepts a person's name (as a string) and a `Consumer<String>` that will process this name to print out a personalized greeting. Test it with different greeting styles.

2. **Modify and Display**: Write a program that takes a single `double` value (representing a bank account balance) and a `Consumer<Double>` that both formats (to two decimal places) and prints the balance. Ensure your consumer demonstrates formatting.

#### Function<T,R> Homework

1. **Unit Conversion**: Write a method that takes a double value (e.g., representing kilometers) and a `Function<Double, Double>` to convert it into another unit (e.g., miles). Test your method by converting kilometers to miles and then to meters.

2. **String to Custom Type**: Suppose you have a class `Person` with a single field `name`. Write a method that takes a string (name) and a `Function<String, Person>` to convert this string into a `Person` object. Demonstrate this method by creating a `Person` object from a string name.

#### Supplier Homework

1. **Unique Identifier Generator**: Implement a method that returns a unique identifier (as a string) every time it is called. Use a `Supplier<String>` to generate this identifier. You might use a combination of the current time and a random element.

2. **Configurable Message Display**: Write a program that uses a `Supplier<String>` to provide different messages (e.g., "Welcome!", "Goodbye!", "Processing..."). The message displayed should be based on a condition in your program (like time of day or program state).

#### BiFunction<T,U,R> Homework

1. **Basic Arithmetic Calculator**: Create a method that takes two integers and a `BiFunction<Integer, Integer, Integer>` to perform a calculation on these integers (e.g., addition, subtraction, multiplication, division). Test your method with different operations.

2. **Text Merger and Analyzer**: Write a program that takes two strings and a `BiFunction<String, String, Integer>` that returns the total length of both strings combined. Test it by merging different pairs of strings and analyzing their total length.