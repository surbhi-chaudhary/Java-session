# Java Tutorial - Session 1

Created: March 11, 2024 4:32 PM
Last Edited Time: March 11, 2024 5:16 PM
Type: Java
Created By: Kishore Karunakaran
Last Edited By: Kishore Karunakaran

# Java Virtual Machine

Let's dive into how the Java Virtual Machine (JVM) works in Java and explore how Java utilizes both a compiler and an interpreter.

Java Virtual Machine (JVM):
The Java Virtual Machine (JVM) is an abstract machine that provides a runtime environment for executing Java bytecode. It is responsible for managing memory, handling security, and providing platform independence. When you run a Java program, the JVM is launched, and it takes care of executing the bytecode.

Here's a step-by-step explanation of how the JVM works:

1. Compilation:
    - When you write Java source code (.java files), you use the Java compiler (javac) to compile it into bytecode (.class files).
    - The Java compiler translates the high-level Java code into platform-independent bytecode instructions.
2. Class Loading:
    - When you run a Java program, the JVM's class loader is responsible for loading the necessary class files into memory.
    - The class loader locates and reads the bytecode of the required classes from the classpath.
3. Bytecode Verification:
    - Before executing the bytecode, the JVM performs bytecode verification to ensure that the bytecode is valid and does not violate any security constraints.
    - This step helps maintain the integrity and security of the Java runtime environment.
4. Interpretation and Execution:
    - The JVM's interpreter reads the bytecode instructions one by one and executes them.
    - The interpreter translates each bytecode instruction into corresponding machine code and executes it on the host machine.
5. Just-In-Time (JIT) Compilation:
    - To improve performance, the JVM also employs Just-In-Time (JIT) compilation.
    - The JIT compiler dynamically compiles frequently executed bytecode into native machine code at runtime.
    - This compiled code is cached and reused, resulting in faster execution compared to interpretation.
6. Garbage Collection:
    - The JVM includes a garbage collector that automatically manages memory.
    - It identifies and removes objects that are no longer in use, freeing up memory for reuse.
    - This automatic memory management simplifies development and helps prevent memory leaks.

**Java's Compiler and Interpreter:**
Java is often referred to as a "compiled and interpreted" language because it utilizes both a compiler and an interpreter.

1. Compiler:
    - The Java compiler (javac) is responsible for compiling Java source code into bytecode.
    - It checks the syntax, performs type checking, and generates platform-independent bytecode (.class files).
    - The compilation process is done before the program is executed.
2. Interpreter:
    - The Java interpreter is part of the JVM and is responsible for executing the bytecode.
    - It reads the bytecode instructions one by one and interprets them, translating them into machine code for execution on the host machine.
    - The interpretation process happens at runtime, allowing Java programs to be executed on any platform with a compatible JVM.

The combination of compilation and interpretation in Java provides several benefits:

- Platform Independence: Java bytecode can be executed on any platform that has a compatible JVM, making Java programs highly portable.
- Security: The bytecode verification step ensures that the bytecode is safe and does not perform any malicious actions.
- Flexibility: The JVM's JIT compiler can optimize the bytecode at runtime, adapting to the specific platform and improving performance.

In summary, the JVM is the runtime environment that executes Java bytecode. It handles class loading, bytecode verification, interpretation, and optimization. Java utilizes both a compiler to convert source code into bytecode and an interpreter (as part of the JVM) to execute the bytecode. This combination allows Java to be platform-independent, secure, and flexible.

Here's a simplified diagram:

```
   Java Source Code
         |
         |
         v
   Java Compiler (javac)
         |
         |
         v
    Java Bytecode
         |
         |
         v
   Java Virtual Machine (JVM)
         |
         |
   +-----+-----+
   |           |
   v           v
Class Loader  Bytecode Verifier
   |           |
   |           |
   v           v
 Interpreter  JIT Compiler
   |           |
   |           |
   +-----+-----+
         |
         |
         v
   Native Machine Code
         |
         |
         v
      Execution

```

Let's break down the diagram:

1. Java Source Code:
    - You write Java source code in .java files.
2. Java Compiler (javac):
    - The Java compiler (javac) compiles the source code into bytecode (.class files).
3. Java Bytecode:
    - The compiled bytecode is platform-independent and can be executed on any JVM.
4. Java Virtual Machine (JVM):
    - The JVM is the runtime environment that executes the bytecode.
5. Class Loader:
    - The class loader is responsible for loading the necessary class files into memory.
6. Bytecode Verifier:
    - The bytecode verifier checks the bytecode for validity and security before execution.
7. Interpreter:
    - The interpreter reads and executes the bytecode instructions one by one.
8. JIT Compiler:
    - The Just-In-Time (JIT) compiler dynamically compiles frequently executed bytecode into native machine code for faster execution.
9. Native Machine Code:
    - The JIT compiler generates native machine code specific to the host platform.
10. Execution:
    - The native machine code is executed directly on the host machine's hardware.

This diagram illustrates the flow of how Java source code is compiled into bytecode, which is then executed by the JVM. The JVM handles class loading, bytecode verification, interpretation, and optimization (through the JIT compiler) to execute the Java program on the host machine.

Note that this is a simplified representation, and the actual JVM architecture and execution process involve additional components and optimizations.

# Data Types

In Java, data types specify the type and size of data that can be stored in a variable. Java has two main categories of data types: primitive data types and reference data types.

1. Primitive Data Types:
Primitive data types are the most basic data types available in Java. They hold a single value and have no additional methods. There are eight primitive data types in Java:
    - `byte`: 8-bit signed two's complement integer (-128 to 127)
    - `short`: 16-bit signed two's complement integer (-32,768 to 32,767)
    - `int`: 32-bit signed two's complement integer (-2,147,483,648 to 2,147,483,647)
    - `long`: 64-bit signed two's complement integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
    - `float`: 32-bit IEEE 754 floating-point (single-precision)
    - `double`: 64-bit IEEE 754 floating-point (double-precision)
    - `boolean`: represents a logical value, either `true` or `false`
    - `char`: 16-bit Unicode character (0 to 65,535)
    
    Here's an example of declaring and initializing variables with primitive data types:
    
    ```java
    byte age = 25;
    short population = 10000;
    int score = 100;
    long distance = 1000000L;
    float price = 9.99f;
    double pi = 3.14159;
    boolean isStudent = true;
    char grade = 'A';
    
    ```
    
2. Reference Data Types:
Reference data types refer to objects, which are instances of classes. They hold the memory address of the object they refer to. Some commonly used reference data types in Java include:
    - `String`: represents a sequence of characters
    - `Arrays`: represents a fixed-size collection of elements of the same type
    - `Classes`: user-defined data types that encapsulate data and behavior
    - `Interfaces`: a collection of abstract methods that a class can implement
    
    Here's an example of declaring and initializing variables with reference data types:
    
    ```java
    String name = "John Doe";
    int[] numbers = {1, 2, 3, 4, 5};
    MyClass obj = new MyClass();
    
    ```
    
3. Wrapper Classes:
Java provides wrapper classes for each primitive data type. These classes allow primitive values to be treated as objects and provide additional methods for manipulation. The wrapper classes are:
    - `Byte` for `byte`
    - `Short` for `short`
    - `Integer` for `int`
    - `Long` for `long`
    - `Float` for `float`
    - `Double` for `double`
    - `Boolean` for `boolean`
    - `Character` for `char`
    
    Wrapper classes are useful when you need to store primitive values in collections or when you require additional functionality provided by the wrapper classes.
    
4. Automatic Type Conversion:
Java supports automatic type conversion, also known as type widening or type promotion. It allows a value of a smaller data type to be automatically converted to a larger data type without explicit casting. For example:
    
    ```java
    int num = 10;
    double result = num; // Automatic type conversion from int to double
    
    ```
    
    However, when assigning a value of a larger data type to a smaller data type, explicit casting is required to avoid data loss:
    
    ```java
    double value = 9.99;
    int num = (int) value; // Explicit casting from double to int
    
    ```
    

Understanding data types is fundamental to programming in Java. Choosing the appropriate data type based on the nature and range of the data helps in efficient memory usage and ensures proper data handling in your Java programs.

## Variables

In Java, there are several types of variables based on their scope, accessibility, and behavior. Let's explore the different types of variables and also discuss the `final` and `static` keywords.

1. Local Variables:
    - Local variables are declared within a method, constructor, or block.
    - They are created when the method or block is entered and destroyed when it exits.
    - Local variables do not have default values and must be initialized before use.
    - They are only accessible within the declared method or block.
2. Instance Variables (Non-Static Fields):
    - Instance variables are declared within a class but outside any method, constructor, or block.
    - They are created when an object of the class is instantiated and destroyed when the object is garbage collected.
    - Instance variables have default values if not explicitly initialized.
    - Each instance of the class has its own copy of instance variables.
    - They are accessible throughout the class using the `this` keyword or the object reference.
3. Class Variables (Static Fields):
    - Class variables are declared within a class, outside any method, constructor, or block, and marked with the `static` keyword.
    - They are created when the class is loaded into memory and destroyed when the program ends or the class is unloaded.
    - Class variables are shared among all instances of the class.
    - They can be accessed using the class name or any instance of the class.
    - Class variables have default values if not explicitly initialized.
4. Parameters:
    - Parameters are variables declared in the method or constructor declaration to receive values when the method or constructor is called.
    - They are used to pass data from the caller to the method or constructor.
    - Parameters have a local scope within the method or constructor.

Now, let's discuss the `final` and `static` keywords:

- `final` keyword:
    - When applied to a variable, the `final` keyword indicates that the variable's value cannot be changed once assigned.
    - For reference types, the `final` keyword means that the variable cannot be reassigned to refer to a different object, but the object itself can still be modified.
    - When applied to a method, the `final` keyword prevents the method from being overridden by subclasses.
    - When applied to a class, the `final` keyword prevents the class from being inherited by other classes.
- `static` keyword:
    - The `static` keyword is used to declare class-level variables and methods.
    - Static variables are shared among all instances of the class and can be accessed using the class name.
    - Static methods belong to the class itself and can be invoked without creating an instance of the class.
    - Static methods can only directly access static members of the class.

Here's an example that demonstrates the different types of variables and the usage of `final` and `static`:

```java
public class MyClass {
    // Instance variable
    private int instanceVar;

    // Class variable (static field)
    private static int staticVar;

    // Final variable
    private final int finalVar = 10;

    public void myMethod(int paramVar) {
        // Local variable
        int localVar = 5;

        // Accessing variables
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Final variable: " + finalVar);
        System.out.println("Parameter variable: " + paramVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void myStaticMethod() {
        // Accessing static variable
        System.out.println("Static variable: " + staticVar);
    }
}

```

In this example, `instanceVar` is an instance variable, `staticVar` is a class variable (static field), `finalVar` is a final variable, `paramVar` is a parameter, and `localVar` is a local variable. The `myStaticMethod()` is a static method that can be called without creating an instance of the class.

Understanding the different types of variables and the `final` and `static` keywords is crucial for proper variable declaration, accessibility, and behavior in Java programs.

# Object Oriented Programming:

 We'll cover inheritance, encapsulation, polymorphism, and abstraction as part of OOPS concept.

### **Inheritance:**

Inheritance is a mechanism where a class inherits properties and behaviours from another class. The class that inherits is called the subclass or derived class, and the class being inherited from is called the superclass or base class.

```java
class Animal {
    protected String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();  // Inherited from Animal class
        dog.bark();  // Specific to Dog class
    }
}

```

### Encapsulation:

Encapsulation is the practice of hiding internal details of an object and providing controlled access to its state through methods. It is achieved using access modifiers (private, protected, public) and getter/setter methods.

```java
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

```

### Polymorphism:

Polymorphism allows objects of different classes to be treated as objects of a common superclass. It can be achieved through method overriding (runtime polymorphism) and method overloading (compile-time polymorphism).

```java
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();  // Calls draw() method of Circle class
        shape2.draw();  // Calls draw() method of Rectangle class
    }
}

```

### Abstraction:

Abstraction is the process of simplifying complex systems by breaking them down into smaller, more manageable parts. It is achieved using abstract classes and interfaces.

```java
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

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        car.start();  // Calls start() method of Car class
    }
}

```