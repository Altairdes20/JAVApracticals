class Arithmetic {
    // Method to add two numbers
         double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
     double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
     double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
     double divide(double num1, double num2) {
        // Check if the divisor is not zero to avoid division by zero
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Return NaN (Not a Number) to represent an undefined result
        }
    }
}

public class ArithmeticDemo {
    public static void main(String[] args) {
    Arithmetic arc = new Arithmetic();
        System.out.println("Addition: " + arc.add(5, 7));
        System.out.println("Subtraction: " + arc.subtract(123, 123));
        System.out.println("Multiplication: " + arc.multiply(2, 231));
        System.out.println("Division: " + arc.divide(24, 2));
    }
}
