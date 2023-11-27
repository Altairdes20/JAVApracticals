import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove duplicates and print the result
        String result = removeDuplicates(inputString);
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    private static String removeDuplicates(String input) {
        // Use a LinkedHashSet to maintain the order while removing duplicates
        Set<Character> uniqueCharacters = new LinkedHashSet<>();

        // Add each character to the set
        for (char ch : input.toCharArray()) {
            uniqueCharacters.add(ch);
        }

        // Build the result string from the set
        StringBuilder resultBuilder = new StringBuilder();
        for (char ch : uniqueCharacters) {
            resultBuilder.append(ch);
        }

        return resultBuilder.toString();
    }
}
