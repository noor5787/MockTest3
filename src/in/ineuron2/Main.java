package in.ineuron2;
//Shape superclass
abstract class Shape {
 public abstract double calculateArea();
}

//Rectangle subclass
class Rectangle extends Shape {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return width * height;
 }
}

//Circle subclass
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Triangle subclass
class Triangle extends Shape {
 private double base;
 private double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return 0.5 * base * height;
 }
}

//ShapeCalculator class
class ShapeCalculator {
 public void printArea(Shape shape) {
     double area = shape.calculateArea();
     System.out.println("Area of the shape: " + area);
 }
}

//Main class to test the program
public class Main {
 public static void main(String[] args) {
     ShapeCalculator calculator = new ShapeCalculator();

     Rectangle rectangle = new Rectangle(5, 10);
     Circle circle = new Circle(3);
     Triangle triangle = new Triangle(4, 6);

     calculator.printArea(rectangle);
     calculator.printArea(circle);
     calculator.printArea(triangle);
 }
}
