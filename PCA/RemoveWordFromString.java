import java.util.Scanner;

public class RemoveWordFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the word to be removed from the user
        System.out.print("Enter the word to remove: ");
        String wordToRemove = scanner.nextLine();

        // Remove the word and print the result
        String result = removeWord(inputString, wordToRemove);
        System.out.println("String after removing the word: " + result);

        scanner.close();
    }

    private static String removeWord(String input, String wordToRemove) {
        // Replace the word to be removed with an empty string
        String result = input.replaceAll("\\b" + wordToRemove + "\\b", "").trim();

        // Remove extra spaces caused by removing the word
        result = result.replaceAll("\\s+", " ");

        return result;
    }
}
