# Java Tutorial - Session 2

* Created: March 13, 2024 9:28 AM
* Last Edited Time: March 13, 2024 9:52 AM
* Type: Java
* Created By: Kishore Karunakaran
* Last Edited By: Kishore Karunakaran

# Interface and Abstract Class

Let’s dive into interface and Abstract class

## Interfaces:

An interface is a contract that specifies a set of abstract methods that a class must implement. It defines the behavior that a class should have without specifying how it should be implemented.

```java
interface Drawable {
    void draw();
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

public class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        circle.draw();  // Output: Drawing a circle.
        rectangle.draw();  // Output: Drawing a rectangle.
    }
}

```

Diagram:

```
   +-----------+
   | Drawable  |
   +-----------+
   |   draw()  |
   +-----------+
         ^
         |
         |
+---------------+
|               |
|               |
|               |
v               v
+-------+   +------------+
| Circle|   | Rectangle  |
+-------+   +------------+
| draw()|   |   draw()   |
+-------+   +------------+

```

In this example, the `Drawable` interface defines the `draw()` method that must be implemented by any class that implements the interface. The `Circle` and `Rectangle` classes implement the `Drawable` interface and provide their own implementation of the `draw()` method.

## Abstract Classes:

An abstract class is a class that cannot be instantiated and may contain abstract methods (methods without an implementation). It serves as a base for other classes to inherit from and can provide common functionality.

```java
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    private double radius;

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
    private double width;
    private double height;

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

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.displayColor();  // Output: Color: Red
        System.out.println("Circle Area: " + circle.getArea());  // Output: Circle Area: 78.53981633974483

        rectangle.displayColor();  // Output: Color: Blue
        System.out.println("Rectangle Area: " + rectangle.getArea());  // Output: Rectangle Area: 24.0
    }
}

```

Diagram:

```
       +-------+
       | Shape |
       +-------+
       | color |
       +-------+
       | getArea() |
       | displayColor() |
       +-------+
           ^
           |
           |
+------------------+
|                  |
|                  |
|                  |
v                  v
+-------+     +------------+
| Circle|     | Rectangle  |
+-------+     +------------+
| radius|     | width      |
+-------+     | height     |
| getArea()   +------------+
|             | getArea()  |
+-------+     +------------+

```

In this example, the abstract `Shape` class defines the `color` attribute and the abstract `getArea()` method. It also provides a concrete `displayColor()` method. The `Circle` and `Rectangle` classes extend the `Shape` class and provide their own implementations of the `getArea()` method based on their specific attributes.

Interfaces and abstract classes serve different purposes in Java:

- Interfaces define a contract for behavior and allow multiple inheritance of type.
- Abstract classes provide a base for inheritance and can contain both abstract and concrete methods.

Interfaces are used when you want to define a common behavior that can be implemented by unrelated classes, while abstract classes are used when you want to provide a common base implementation that can be extended by subclasses.

# Properties:

## Properties of Interfaces:

1. An interface is declared using the `interface` keyword.
2. An interface can contain only abstract methods (methods without a body), default methods (introduced in Java 8), and static methods (introduced in Java 8).
3. All methods in an interface are implicitly public and abstract, even if not explicitly declared as such.
4. An interface cannot contain instance variables, but it can have constants (static final variables).
5. A class can implement multiple interfaces, achieving multiple inheritance of type.
6. An interface can extend other interfaces, creating an inheritance hierarchy of interfaces.
7. When a class implements an interface, it must provide an implementation for all the abstract methods declared in the interface (unless the class is abstract).
8. Interfaces are used to define a contract for behavior that classes must adhere to.
9. Interfaces provide a way to achieve loose coupling between classes, as classes can interact through the interface rather than directly with each other.
10. Interfaces are often used to define a common behavior that can be shared by unrelated classes.

## Properties of Abstract Classes:

1. An abstract class is declared using the `abstract` keyword.
2. An abstract class can contain both abstract methods (methods without a body) and concrete methods (methods with a body).
3. An abstract class can have instance variables, constructors, and static variables.
4. A class can extend only one abstract class, achieving single inheritance.
5. An abstract class can provide a base implementation for its subclasses, containing common code and behavior.
6. Abstract classes can have non-final variables, allowing subclasses to modify their values.
7. When a class extends an abstract class, it must provide an implementation for all the abstract methods declared in the abstract class (unless the subclass is also abstract).
8. Abstract classes are used to define a common base for related classes, providing a way to share code and enforce certain behaviors.
9. Abstract classes can have constructors, which are called when an instance of a concrete subclass is created.
10. Abstract classes can be used to define a template for subclasses, providing a partial implementation that subclasses can build upon.

Here's a comparison table highlighting the differences between interfaces and abstract classes:

| Property | Interface | Abstract Class |
| --- | --- | --- |
| Methods | Abstract, static | Abstract and concrete |
| Variables | Constants (static final) | Instance and static variables |
| Constructors | Not allowed | Allowed |
| Inheritance | Multiple inheritance | Single inheritance |
| Implementation | All methods must be implemented | Some methods can be implemented |
| Access modifiers for methods | Implicitly public | Can have any access modifier |
| Extends keyword | Extends other interfaces | Extends other classes or abstracts |
| Implements keyword | Implemented by classes | Not applicable |
| Purpose | Define a contract for behavior | Provide a base for related classes |

Interfaces and abstract classes serve different purposes in Java. Interfaces are used to define a contract for behavior and allow multiple inheritance of type, while abstract classes are used to provide a base implementation and share common code among related classes.

Choosing between an interface and an abstract class depends on the specific requirements of your design and the relationships between the classes involved.

# Strategy Pattern:

The Strategy pattern is one of the most common design patterns that utilize interfaces in Java. The Strategy pattern allows you to define a family of algorithms, encapsulate each one, and make them interchangeable. It lets the algorithm vary independently from clients that use it.

Here's an example that illustrates the Strategy pattern using an interface:

Let's say we have a game character that can use different weapons to attack. Each weapon has its own attack behavior. We can use the Strategy pattern to define the attack behavior as an interface and create separate classes for each specific weapon.

## Define the `AttackStrategy` interface:

```java
public interface AttackStrategy {
    void attack();
}

```

## Create an abstract class `Weapon` that implements the `AttackStrategy` interface:

```java
public abstract class Weapon implements AttackStrategy {
    protected String weaponName;

    public Weapon(String weaponName) {
        this.weaponName = weaponName;
    }

    public abstract void attack();

    public void displayWeaponName() {
        System.out.println("Weapon: " + weaponName);
    }
}

```

## Create concrete classes that extend the `Weapon` abstract class:

```java
public class Sword extends Weapon {
    public Sword() {
        super("Sword");
    }

    @Override
    public void attack() {
        System.out.println("Attacking with a sword!");
    }
}

public class Bow extends Weapon {
    public Bow() {
        super("Bow");
    }

    @Override
    public void attack() {
        System.out.println("Attacking with a bow and arrow!");
    }
}

public class MagicWand extends Weapon {
    public MagicWand() {
        super("Magic Wand");
    }

    @Override
    public void attack() {
        System.out.println("Attacking with magic spell!");
    }
}

```

## Update the `Character` class to accept the `AttackStrategy` through the constructor:

```java
public class Character {
    private AttackStrategy attackStrategy;

    public Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void displayWeaponName() {
        if (attackStrategy instanceof Weapon) {
            ((Weapon) attackStrategy).displayWeaponName();
        }
    }
}

```

## Use the `Character` class and create instances with different attack strategies:

```java
public class Main {
    public static void main(String[] args) {
        Character swordCharacter = new Character(new Sword());
        swordCharacter.displayWeaponName(); // Output: Weapon: Sword
        swordCharacter.attack(); // Output: Attacking with a sword!

        Character bowCharacter = new Character(new Bow());
        bowCharacter.displayWeaponName(); // Output: Weapon: Bow
        bowCharacter.attack(); // Output: Attacking with a bow and arrow!

        Character magicCharacter = new Character(new MagicWand());
        magicCharacter.displayWeaponName(); // Output: Weapon: Magic Wand
        magicCharacter.attack(); // Output: Attacking with magic spell!
    }
}

```

## Summary:

- The `Weapon` abstract class is introduced, which implements the `AttackStrategy` interface. It provides a common attribute `weaponName` and a constructor to initialize it. It also declares the abstract method `attack()` that subclasses must implement, and a concrete method `displayWeaponName()` to display the weapon's name.
- The concrete classes `Sword`, `Bow`, and `MagicWand` extend the `Weapon` abstract class and provide their own implementations for the `attack()` method.
- The `Character` class now accepts the `AttackStrategy` through the constructor It also has a `displayWeaponName()` method that checks if the `attackStrategy` is an instance of `Weapon` and calls the `displayWeaponName()` method accordingly.
- In the `Main` class, we create instances of `Character` with different weapon strategies and demonstrate the usage of the `displayWeaponName()` and `attack()` methods.

This updated code showcases the use of both an interface (`AttackStrategy`) and an abstract class (`Weapon`). The abstract class provides a base implementation and common behavior for weapons, while the interface defines the contract for the attack behavior. The Character class relies on the interface for attacking, allowing for flexibility and interchangeability of attack strategies.