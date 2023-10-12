package oops;
abstract class Shape2 {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

//Concrete class Rectangle
class Rectangle extends Shape2 {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract methods
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

//Concrete class Circle
class Circle extends Shape2 {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract methods
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

//Concrete class Triangle
class Triangle1 extends Shape2{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle1(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementing abstract methods
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class lines {
	public static void main(String[] args) {
	    //Creating instances of Rectangle, Circle, and Triangle
	    Rectangle rectangle = new Rectangle(5, 3);
	    Circle circle = new Circle(4);
	    Triangle1 triangle = new Triangle1(6, 4, 5, 4, 3);

	    //Calculating areas and perimeters
	    double rectangleArea = rectangle.calculateArea();
	    double rectanglePerimeter = rectangle.calculatePerimeter();

	    double circleArea = circle.calculateArea();
	    double circlePerimeter = circle.calculatePerimeter();

	    double triangleArea = triangle.calculateArea();
	    double trianglePerimeter = triangle.calculatePerimeter();
	    
	    System.out.println("Rectangle Area: " + rectangleArea);
	    System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
	    
	    System.out.println("Circle Area: " + circleArea);
	    System.out.println("Circle Perimeter: " + circlePerimeter);
	    
	    System.out.println("Triangle Area: " + triangleArea);
	    System.out.println("Triangle Perimeter: " + trianglePerimeter);
	}
}
 