import java.util.Scanner;

class AreaCalculator {

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Calculate the area of a circle");
            System.out.println("2. Calculate the area of a triangle");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double circleRadius = scanner.nextDouble();
                    double circleArea = calculateCircleArea(circleRadius);
                    System.out.println("Area of the circle: " + circleArea);
                    break;

                case 2:
                    System.out.print("Enter the base of the triangle: ");
                    double triangleBase = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double triangleHeight = scanner.nextDouble();
                    double triangleArea = calculateTriangleArea(triangleBase, triangleHeight);
                    System.out.println("Area of the triangle: " + triangleArea);
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
