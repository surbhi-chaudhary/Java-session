# Java Tutorial - Session 3

Created: March 18, 2024 12:10 PM
Last Edited Time: March 18, 2024 4:21 PM
Type: Java
Created By: Kishore Karunakaran
Last Edited By: Kishore Karunakaran

# Interfaces

In Java 8, we got an exciting feature in interface where we can define default and static methods. Let’s understand why they introduced this feature with case study. Let's take an example of an interface called `Loggable` that represents the behavior of logging messages. We'll include default and static methods in this interface to demonstrate their usage and discuss why Java introduced this feature.

```java
public interface Loggable {
    // Abstract method
    void log(String message);

    // Default method
    default void logInfo(String message) {
        log("[INFO] " + message);
    }

    // Static method
    static void logError(String message) {
        System.err.println("[ERROR] " + message);
    }
}

```

In this example, the `Loggable` interface has the following methods:

1. `log(String message)`: An abstract method that defines the contract for logging a message. Classes implementing this interface must provide their own implementation of this method.
2. `logInfo(String message)`: A default method that provides a default implementation for logging an information message. It internally calls the `log()` method with the prefix `[INFO]`. Classes implementing this interface can choose to use this default implementation or override it if needed.
3. `logError(String message)`: A static method that logs an error message to the standard error stream. It is a utility method that can be called directly on the interface without requiring an instance of a class implementing the interface.

Now, let's create a class that implements the `Loggable` interface:

```java
public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

```

The `ConsoleLogger` class implements the `Loggable` interface and provides its own implementation of the `log()` method to log messages to the console.

Here's an example of how the `Loggable` interface can be used:

```java
public class Main {
    public static void main(String[] args) {
        Loggable logger = new ConsoleLogger();

        logger.log("This is a regular message");
        logger.logInfo("This is an information message");
        Loggable.logError("This is an error message");
    }
}

```

Output:

```
This is a regular message
[INFO] This is an information message
[ERROR] This is an error message

```

Now, let's discuss why Java introduced default and static methods in interfaces and how they differ from abstract classes:

1. **Backward Compatibility:** Default methods in interfaces were introduced to allow adding new methods to existing interfaces without breaking the code of classes that already implement those interfaces. With default methods, existing classes can continue to work without modification, providing backward compatibility.
2. **Multiple Inheritance of Behavior:** Interfaces with default methods enable a form of multiple inheritance of behavior. A class can implement multiple interfaces, and if those interfaces have default methods, the class inherits the behavior from all of them. This is not possible with abstract classes since a class can only extend one abstract class.
3. **Flexibility and Optional Behavior:** Default methods in interfaces provide a way to define optional or additional behavior that classes can choose to override if needed. This allows for more flexibility in interface design and enables classes to selectively inherit or override behavior.
4. **Utility Methods:** Static methods in interfaces serve as utility methods that are associated with the interface itself rather than instances of implementing classes. They can be called directly on the interface, providing a convenient way to define common functionality related to the interface.

While abstract classes and interfaces with default methods may seem similar, they serve different purposes. Abstract classes are primarily used for defining a common base implementation and shared state among related classes, while interfaces with default methods are used for defining contracts and providing default behavior without the need for a common base class.

In the `Loggable` interface example, the default `logInfo()` method provides a convenient way to log information messages without requiring each implementing class to define its own implementation. The static `logError()` method serves as a utility method for logging error messages directly through the interface.

I hope this example and explanation clarify the usage and benefits of default and static methods in interfaces and how they differ from abstract classes. Let me know if you have any further questions!

## Abstract Class VS Interface:

If interface can have default method and what is the use of abstract class ?

Here's a table comparing interfaces with default methods and abstract classes, highlighting their key differences and use cases:

| Feature | Interface with Default Methods | Abstract Class |
| --- | --- | --- |
| Purpose | Defines a contract for behavior | Provides a base for subclasses to inherit from |
| Abstract Methods | Can have abstract methods | Can have abstract methods |
| Concrete Methods | Can have default methods with implementation | Can have concrete methods with implementation |
| Fields | Can only have constants (static final) | Can have instance variables and constants |
| Constructors | Cannot have constructors | Can have constructors |
| Access Modifiers | Methods are implicitly public | Methods can have any access modifier |
| Multiple Inheritance | A class can implement multiple interfaces | A class can extend only one abstract class |
| Inheritance Hierarchy | Promotes a flat hierarchy | Promotes a hierarchical inheritance structure |
| Backward Compatibility | Allows adding new methods without breaking existing code | Requires changes in subclasses when adding new methods |
| Optional Behavior | Provides optional behavior through default methods | Cannot provide optional behavior without implementation |
| Utility Methods | Can have static methods for utility functionality | Can have static methods for utility functionality |
| Use Case | Defining contracts and providing default behavior | Defining a base implementation and shared behavior |

Explanation:

1. Purpose:
    - Interfaces with default methods are used to define contracts for behavior and provide default implementations for methods.
    - Abstract classes are used to provide a base implementation that subclasses can inherit from and extend.
2. Abstract Methods:
    - Both interfaces and abstract classes can have abstract methods that subclasses must implement.
3. Concrete Methods:
    - Interfaces can have default methods that provide a default implementation, which subclasses can choose to override.
    - Abstract classes can have concrete methods with implementation that subclasses can inherit and use directly.
4. Fields:
    - Interfaces can only have constants (static final fields).
    - Abstract classes can have instance variables and constants.
5. Constructors:
    - Interfaces cannot have constructors.
    - Abstract classes can have constructors to initialize instance variables and perform setup.
6. Access Modifiers:
    - Methods in interfaces are implicitly public.
    - Methods in abstract classes can have any access modifier (public, protected, default, private).
7. Multiple Inheritance:
    - A class can implement multiple interfaces, achieving a form of multiple inheritance.
    - A class can extend only one abstract class, following single inheritance.
8. Inheritance Hierarchy:
    - Interfaces promote a flat hierarchy, where classes can implement multiple interfaces.
    - Abstract classes promote a hierarchical inheritance structure, where classes extend a base class.
9. Backward Compatibility:
    - Default methods in interfaces allow adding new methods without breaking existing code that implements the interface.
    - Adding new abstract methods in an abstract class requires changes in all subclasses.
10. Optional Behavior:
    - Interfaces can provide optional behavior through default methods, which subclasses can choose to override.
    - Abstract classes cannot provide optional behavior without requiring subclasses to provide an implementation.
11. Utility Methods:
    - Both interfaces and abstract classes can have static methods for utility functionality.
12. Use Case:
    - Interfaces with default methods are used when defining contracts and providing default behavior that subclasses can override if needed.
    - Abstract classes are used when defining a base implementation and shared behavior that subclasses can inherit and extend.

This table highlights the key differences between interfaces with default methods and abstract classes. The choice between using an interface or an abstract class depends on the specific requirements of the design, such as the need for multiple inheritance, providing default behavior, or defining a base implementation.

# Static in Java:

In Java, the keyword `static` is primarily used for memory management and belongs to the class rather than instances of the class. It can be applied to variables, methods, blocks, and nested classes. Let's dive into each of these variants:

### 1. Static Variables

Static variables are also known as static class variables. They are shared among all instances of a class because they belong to the class, not any individual object. This means there's only one copy of that variable in memory that's shared by all instances of the class.

### Example:

```java
public class StaticVariables {
    public static void main(String[] args) {
        ClassName obj1 = new ClassName();
        ClassName obj2 = new ClassName();

        obj1.increment();
        obj2.increment();

        System.out.println(ClassName.staticVar); // Output will be 2
    }
}

class ClassName {
    static int staticVar = 0;

    void increment() {
        staticVar++;
    }
}

```

### 2. Static Methods

Static methods belong to the class rather than the object of a class. This means you can call a static method without creating an instance of the class. Static methods can access static data members and can change the value of it.

### Example:

```java
public class StaticMethods {

    public static void main(String[] args) {
        ClassNameWithStaticMethod.staticMethod(); // No object is created, directly accessing the static method.
    }
}


class ClassNameWithStaticMethod {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

```

### 3. Static Blocks

Static blocks, also known as static initialization blocks, are used for static initialization of a class. This block gets executed when the class is loaded in the memory. It can be used to initialize static variables when the class is loaded.

### Example:

```java
public class StaticBlocks {
    static int num;
    static String myStr;

    // Static block
    static {
        num = 97;
        myStr = "Static keyword in Java";
    }

    public static void main(String args[]) {
        System.out.println("Value of num: " + num);
        System.out.println("Value of myStr: " + myStr);
    }
}

```

### 4. Static Classes (Nested Static Class)

In Java, we can have static inner classes. Nested static classes do not need a reference to an outer class object. This is useful when your nested class doesn't need to access any instance methods or fields of the outer class.

### Example:

```java
class OuterClass {
    static class NestedStaticClass {
        void myMethod() {
            System.out.println("This is a method in a static nested class.");
        }
    }
}

public class StaticClasses {
    public static void main(String[] args) {
        OuterClass.NestedStaticClass myInstance = new OuterClass.NestedStaticClass();
        myInstance.myMethod();
    }
}

```

These are the main uses of the `static` keyword in Java, each serving a specific purpose in managing class-level data and behaviors.