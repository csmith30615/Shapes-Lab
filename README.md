# Shapes-Lab
## Project Summary

Java lab meant to teach inheritence. In this lab, we initially wrote each shape file (Circle, Triangle, and Rectangle) seperately, even though we had code that was copied throughout the files. In order to fix this issue, we created a superclass and called it Shapes. Shapes includes common variables like x, y, and z, and common methods, like toString and area.

## Running the Program

This code was written in Java 1.7. 
\
\
In order to run, download the code and import it into a compiler (capable of compiling Java 1.7), compile it, and run it.


 # ShapesLab.java

### `public class ShapesLab`

Tests if the shapes classes function properly

## Main class

### `public static void main(String[] args)`

Creates 6 shapes (2 of each), cycles through each of them, and prints their String format to the System

 * **Parameters:** `args` — the command line arguments

 
 
# Circle.java

### `public class Circle extends Shape`

Creates a Circle object

## Constructor

### `public Circle(int X, int Y, int Z, double radius)`

Creates a Circle shaped object

 * **Parameters:**
   * `radius` — double radius of this Circle
   * `X` — int X coordinate of the center of this Circle
   * `Y` — int Y coordinate of the center of this Circle
   * `Z` — int Z coordinate of the center of this Circle

## Setters

### `public void setRadius(double newRadius)`

Sets this Circle's radius

 * **Parameters:** `newRadius` — double new radius of the circle
 
 ## Getters

### `public double getRadius()`

Gets the radius of this Circle

 * **Returns:** double radius of Circle

### `@Override public double area()`

Gets the area of this Circle

 * **Returns:** double area of this Circle

### `@Override public String toString()`

Returns String format of this Circle

 * **Returns:** String written to include Shape coordinates, shape, and area
 
 
 
 # Point.java

### `public class Point`

Creates a 3D Point Object

## Constructor

### `public Point(int X, int Y, int Z)`

Creates a point object

 * **Parameters:**
   * `X` — int X coordinate (between 0 and 500)
   * `Y` — int Y coordinate (between 0 and 500)
   * `Z` — int Z coordinate (between 0 and 500)

## Getters

### `public int getX()`

Gets the X coordinate of this Point

 * **Returns:** X coordinate of this Point

### `public int getY()`

Gets the Y coordinate of this Point

 * **Returns:** Y coordinate of this Point

### `public int getZ()`

Gets the Z coordinate of this Point

 * **Returns:** Z coordinate of this Point

### `public String getCoordinates()`

Gets the coordinates of this Point

 * **Returns:** String coordinates of this Point (Written as (X, Y, Z))



# Rectangle.java

### `public class Rectangle extends Shape`

Creates a Rectangle Object

## Constructor

### `public Rectangle(int X, int Y, int Z, double base, double height)`

Creates a Rectangle shaped object

 * **Parameters:**
   * `base` — double base of this Rectangle
   * `height` — double height of this Rectangle
   * `X` — int X coordinate of the center of this Rectangle
   * `Y` — int Y coordinate of the center of this Rectangle
   * `Z` — int Z coordinate of the center of this Rectangle

## Setters

### `public void setBase(double newBase)`

Sets this Rectangle's base

 * **Parameters:** `newBase` — double new base for this Rectangle

### `public void setHeight(double newHeight)`

Sets this Rectangle's height

 * **Parameters:** `newHeight` — double new height for this Rectangle
 
 ## Getters

### `public double getBase()`

Gets the base of this Rectangle

 * **Returns:** double base of this Rectangle

### `public double getHeight()`

Gets the height of this Rectangle

 * **Returns:** double height of this Rectangle

### `@Override public double area()`

Gets the area of this Rectangle

 * **Returns:** double area of this Rectangle

### `@Override public String toString()`

Returns String format of this Rectangle

 * **Returns:** String written to include Shape coordinates, shape, and area



# Shapes.java

### `public abstract class Shape`

Parent class for the other shapes

## Constructor

### `public Shape(int X, int Y, int Z)`

Creates a Shape object, superclass for other shapes

 * **Parameters:**
   * `X` — int X coordinate of the center of the shape
   * `Y` — int Y coordinate of the center of the shape
   * `Z` — int Z coordinate of the center of the shape

## Setters

### `public void setCenter(Point cent)`

Sets this Shape's Point center

 * **Parameters:** `cent` — Point center of this Shape
 
 ## Getters

### `public int getX()`

Gets the X coordinate of Point center of this Shape

 * **Returns:** int X coordinate of the center of this Shape

### `public int getY()`

Gets the Y coordinate of Point center of this Shape

 * **Returns:** int Y coordinate of the center of this Shape

### `public int getZ()`

Gets the Z coordinate of Point center of this Shape

 * **Returns:** int Z coordinate of the center of this Shape

### `public String getCenter()`

Gets the coordinates of the center of this Shape

 * **Returns:** String coordinates of this Shape's center (Written as (X, Y, Z))



# Triangle.java

### `public class Triangle extends Shape`

Creates a Triangle object

## Constructor

### `public Triangle(int X, int Y, int Z, double base, double height)`

Creates a Triangle shaped object

 * **Parameters:**
   * `base` — double base of this Triangle
   * `height` — double height of this Triangle
   * `X` — int X coordinate of this Triangle
   * `Y` — int Y coordinate of this Triangle
   * `Z` — int Z coordinate of this Triangle

## Setters

### `public void setBase(double newBase)`

Sets this Triangle's base

 * **Parameters:** `newBase` — double new base value of this Triangle

### `public void setHeight(double newHeight)`

Sets this Triangle's height

 * **Parameters:** `newHeight` — double new height value of this Triangle
 
 ## Getters

### `public double getBase()`

Gets the base of this Triangle

 * **Returns:** double base of this Triangle

### `public double getHeight()`

Gets the height of this Triangle

 * **Returns:** double height of this Triangle

### `@Override public double area()`

Gets the area of this Triangle

 * **Returns:** double area of this Triangle

### `@Override public String toString()`

Returns String format of this Triangle

 * **Returns:** String written to include Shape coordinates, shape, and area
