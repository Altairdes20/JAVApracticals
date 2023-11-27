import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Get the second string from the user
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the strings
        String concatenatedString = firstString.concat(secondString);

        // Display the result
        System.out.println("Concatenated String: " + concatenatedString);

        scanner.close();
    }
}
