import java.util.Scanner;

public class SwapLastTwoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string (length must be 2 or more): ");
        String inputString = scanner.nextLine();

        // Check if the length of the string is 2 or more
        if (inputString.length() < 2) {
            System.out.println("Invalid input. The length must be 2 or more.");
        } else {
            // Swap the last two characters and print the result
            String result = swapLastTwoCharacters(inputString);
            System.out.println("String after swapping the last two characters: " + result);
        }

        scanner.close();
    }

    private static String swapLastTwoCharacters(String input) {
        // Convert the string to a character array for manipulation
        char[] charArray = input.toCharArray();

        // Swap the last two characters
        char temp = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = charArray[charArray.length - 2];
        charArray[charArray.length - 2] = temp;

        // Convert the character array back to a string
        return new String(charArray);
    }
}
