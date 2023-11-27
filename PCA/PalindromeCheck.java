import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String input) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        String cleanedString = input.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false; // Characters do not match
            }
            left++;
            right--;
        }

        return true; // String is a palindrome
    }
}
