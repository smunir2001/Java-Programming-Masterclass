smunir2001@gmail.com | GitHub - Java Programming Masterclass | October 18th, 2022
# GitHub - Java Programming Masterclass
## Folder directory
* ### Object-Oriented Programming (Part 1)
* ### Object-Oriented Programming (Part 2)
## Object-Oriented Programming Concepts
* classes
* constructors
* inheritance
* composition
* polymorphism
* encapsulation

## Classes
To understand classes, we need to understand what are objects.
* objects have two major characteristics:
    * state:
        * a software object stores its state in fields, and we know fields as variables.
    * behavior: 
        * a software object exposes its behavior with methods.

We can think of classes as templates or blueprints for creating objects.
* classes can be thought of as a powerful way to create user-defined data types.

## Constructors
Constructors are methods with the same class name and no return type.
* they allow us to initialize new instances of objects according to available parameters and specs.

* if there is no user-defined constructor, then Java will automatically throw in an empty (no-argument) constructor.

## Inheritance
We can think of the OOP paradigm of inheritance as objects that share/have common properties/characteristics with each other. However, these objects may have additional capabilities specific to themselves and make the different yet sharing some common elements.
* similar to a "is-a" relationship

* all members of the state and behaviors of a class can be inherited by the subclass.

## Composition
This has to do with the __"has-a"__ relationship instead of a __"is-a"__ relationship like in the concept of inheritance.

Creating objects of objects --> object hierarchy

## Encapsulation
This has to do with the mechanism that allows you to access restrict access to certain components in the objects that we are creating.
* authorized/unauthorized access
* private members/methods
* make internal changes without affecting code outside the subjective class.

## Polymorphism
This is the OOP mechanism that gives programmers the capability to allow actions to act differently based on what object is acting.

## Reference vs. Object vs. Instance vs. Class
Lets use the analogy of building a house to understand classes:

A __class__ is basically a blueprint for a house, using the blueprint (plans) we can build as many houses as we like based on those plans.

Each house you build (in other words instantiate using the __new__ operator) is an __object__, also known as an __instance__.

Each house you build has an address (a physical location). In other words if you want to tell someone where you live, you give them your address (perhaps written on a piece of paper). This is known as a __reference__.

You can copy that __reference__ as many times as you like but there is still just one house. In other words we are copying the paper that has the address on it not the house itself.

We can pass __references__ as __parameters__ to __constructors__ and __methods__.

## this vs. super
The keyword __super__ is used to access/call the parent class members (variables & methods).

The keyword __this__ is used to call the current class members (variables & methods). This is required when we have a parameter with the same name as an instance variable (field).

## this() vs super() call
Use __this()__ to call a constructor from another overloaded constructor in the same class.
* __this()__ call can be used only in a constructor
* this call must be the first statement in a constructor
* it's used with constructor chaining, in other words when one constructor calls another constructor, and helps to reduce duplicated code.

The only way to call a parent constructor is by calling __super()__. This calls the parent constructor.
* The Java compiler puts a default call to __super()__ if we don't add it, and it is always the no-args __super__ which is inserted by the compiler (constructor without argumnets).
* the call to __super()__ must be the first statement in each constructor.

Even abstract classes have constructors, although you can never instantiate an abstract class using the new keyword.
* an abstract class is still a __super__ class, so its constructors run when someone makes an instance of a concrete subclass.
* __NOTE:__ a constructor can have a __super()__ or __this()__ but never both.