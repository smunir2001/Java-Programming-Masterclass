smunir2001@gmail.com | GitHub - Java Programming Masterclass | October 18th, 2022
# GitHub - Java Programming Masterclass
## Folder directory
* ### Object-Oriented Programming (Part 1)
* ### Object-Oriented Programming (Part 2)
* ### Working with Images
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

## Method overloading vs. Method overriding
### Method overloading
Method __overloading__ means providing two or more separate methods in a class with the __same name__ but __different parameters__.
* the method return type may or may not be different and that allows us to reuse the same method name.

__Overloading__ is very handy, it reduces duplicated code and we don't have to remember multiple method names.
* we can overload static and instance methods

__Overloading__ does not have anything to do with polymorphism but Java developers often refer to overloading as Compile Time Polymorphism.
* in other words the compiler decides which method is going to be called based on the method name, return type and argument list.

Usually __overloading__ happens inside a single class, but a method can also be treated as __overloaded__ in the subclass of that class.
* this is beacause the subclass inherits one version of the method from the parent class and then the subclass can have another overloaded version of the method.

Methods will be considered overloaded if both follow the following rules:
* methods must have the same method name
* methods must have different parameters

If methods follow the rules above then they may or may not
* have different return types
* have different access modifiers
* throw different checked/unchecked exceptions

### Method overriding
Method __overriding__ means defining a method in a child class that already exists in the parent class with same signature (same name, same arguments).
* by extending the parent class the child class gets all the methods defined in the parent class (those methods are also known as derived methods).

Method __overriding__ is also known as __Runtime Polymorphism__ and __Dynamic Method Dispatch__, because the method that is going to be called is decided at runtime by the JVM.

When we __override__ a method it is recommended to put __@Override__ immediately above the method definition. This is an annotation that the compiler reads and will then show us an error if we don't follow overriding rules correctly.
* We __cannot override static__ methods, __only instance methods__.

Method overriding rules:
* must have the same name and same arguments
* return type can be a subclass of the return type in the parent class
* it cannot have a lower access modifier

__Only inherited methods can be overridden__, in other words methods can be overriden only in child classes.

__Constructors and private methods cannot be overridden__.

Methods that are final cannot be overridden.

A subclass can use __super.methodName()__ to call the superclass version of an overridden method.

## Static vs. Instance methods
__Static methods__ are declared using a __static__ modifier.

__Static methods cannot__ access instance methods and instance variables directly.
* they are usually used for operations that don't require any data from an instance of the class (from "this").

__Instance methods__ belong to an instance of a class.

To use an __instance method__ we have to instantiate the class first usually by using the __new__ keyword.
* __instance methods__ can access instance methods and instance variables directly.
* __instance methods__ can also access static methods and static variables directly.

## Static vs. Instance variables
### Static variables
Declared by using the keyword __static__.
* __Static variables__ are also known as __static member variables__.
* every instance of that class __shares__ the same static variable.
* if changes are made to that variable, all other instances will see the effect of the change.

## Instance variables
Do not use the __static__ keyword.
* instance variables are also known as fields or member variables.
* __instance variables__ belong to an instance of a class.
    * every instance has it's own copy of an instance variable.
    * every instance can have a different value (state).
    * instance variables represent the state of an instance.

## Working with Images
Images are described by a width and a height, measured in pixels, and have a coordinate system that is independent of the drawing surface.

Common tasks when working with images:
* loading an extern GIF, PNG, JPEG image format file into the internal image representation used by Java 2D.

* directly creating a Java 2D image and redering to it.

* drawing the contents of a Java 2D image onto a drawing surface.

* saving the contents of a Java 2D image to an external GIF, PNG, or JPEG image file.

Two main classes that we must learn about to work with images in Java:
* The __java.awt.Image__ class is the superclass that represents graphical images as rectangular arrays of pixels.

* The __java.awt.image.BufferedImage__ class, which extends the __Image__ class to allow the application to operate directly with image data (for example, retrieving or setting up the pixel color). Applications can directly construct instances of this class.
    * Since __BufferedImage__ is a subclass of __Image__ it can be rendered by the Graphics and Graphics 2D methods that accept an __Image__ parameter.