# Object Oriented Programming 2 Assignment

## Instructions

The following section descibes a system for defining a number of different shapes: **Circle**s, **Rectangle**s, and **Square**s (a subset of Rectangles). All of the shapes share a number of common properties and methods (eg. a name, the ability to calculate their own area), which should be implemented by an abstract class **Shape**.

* Read through the @Test portion of App.java to get a sense of what test your classes need to pass and how the concept of **polymorphism** is being used
* Implement the system in Java within this project folder  
  * Create the following class definition files within the src folder:  
    * Shape.java
    * Circle.java
    * Rectangle.java
    * Square.java
  * Feel free to use the **main()** method in App.java to put any debugging and testing code as needed
  * Do not change anything after the @Test line in App.java, it is used to automatically test your code
  
## Class Descriptions

### Shape.java

There should not be the ability to create a Shape object, so the class should be **abstract**. Rather, all specific shapes inherit some generic functionality from this class.

All Shapes should have a name (a String) that is assigned in the constructor, along with a **getter method that returns its name** and a **setter method** that changes the name. 

All Shapes should also have the following methods, but the implementation if these methods will be different depeding on the kind of shape, so should be **abstract**:  
* public abstract String toString()
* public abstract double getArea()
* public abstract double getPerimeter()

### Circle.java

Circles are a type of Shape and are defined by their radius (double). A Circle should have a default radius of 10. 

Circles need a constructor that takes in just a name that invokes the constructor of Shape (use "super"), but they should also have their own constructor that takes in both a name (String) and a radius (double).

Circles should have **getter** and **setter** methods for their radius and must override the abstract methods inherited from Shape.java (that's how abstract works):  
* getArea() and getPerimeter() should calculate and return their respective values
* getString() should return "{name}, a Circle with radius {radius}" (the words in {} should be replaced with the actual name and radius of the Circle itself)

### Rectangle
Rectangles are a type of Shape and are defined by the length(double) and width (double). A Rectangle should have a default length of 5 and a default width of 8. 

Rectangles need a constructor that takes in just a name that invokes the constructor of Shape (use "super"), but they should also have their own constructor that takes in a name (String), a length (double) and a width (double).

Rectangles should have **getter** and **setter** methods for their length and width and must override the abstract methods inherited from Shape.java:  
* getArea() and getPerimeter() should calculate and return their respective values
* getString() should return "{name}, a Rectangle with length {length} and width {width}" (the words in {} should be replaced with the actual values of the Rectangle itself)

### Square
Squares are a a subset of **Rectangles** with a few small tweaks:
* Constructors that call the appropriate constructors of Rectangle are needed, again using "super"
* Both length and width should default to 3
* Another constructor should be available that just takes in a side length and then assigns that value to both the width and height
* Add a **getter** and **setter** method for the side length
    * note that the Square does not need a "side" variable, as the length and width inherited from Rectangle serve this purpose
* Override the width and length setters inherited from Rectangle to ensure the length and width are always the same 
* getString() should return "{name}, a Circle with side length {side}" (the words in {} should be replaced with the actual values of the Square itself)
