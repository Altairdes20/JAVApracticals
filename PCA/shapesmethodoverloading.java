import java.util.Scanner;

class Figure {
    protected double dimension1;
    protected double dimension2;

    public Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double area() {
        System.out.println("Error: Area calculation not defined for the base class.");
        return 0.0;
    }
}

class Rectangle extends Figure {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return dimension1 * dimension2;
    }
}

class Triangle extends Figure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class shapesmethodoverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage for Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangle.area());

        // Example usage for Triangle
        System.out.print("Enter the base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();

        Triangle triangle = new Triangle(triangleBase, triangleHeight);
        System.out.println("Area of the triangle: " + triangle.area());

        scanner.close();
    }
}
