smunir2001@gmail.com | GitHub - Java Programming Masterclass | January 11th, 2022
# Object-Oriented Programming (Part 1)

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