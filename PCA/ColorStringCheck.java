import java.util.Scanner;

public class ColorStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the input string begins with "red" or "black"
        String colorResult = checkColorString(inputString);

        // Display the result
        if (colorResult.isEmpty()) {
            System.out.println("Input does not begin with 'red' or 'black'.");
        } else {
            System.out.println("Color string: " + colorResult);
        }

        scanner.close();
    }

    private static String checkColorString(String input) {
        // Convert the string to lowercase for case-insensitive comparison
        String lowerCaseInput = input.toLowerCase();

        // Check if the string begins with "red" or "black"
        if (lowerCaseInput.startsWith("red")) {
            return "red";
        } else if (lowerCaseInput.startsWith("black")) {
            return "black";
        } else {
            return ""; // Empty string if it doesn't begin with "red" or "black"
        }
    }
}
