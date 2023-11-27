import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the character to be replaced
        System.out.print("Enter the character to be replaced: ");
        char oldChar = scanner.next().charAt(0);

        // Get the replacement character
        System.out.print("Enter the replacement character: ");
        char newChar = scanner.next().charAt(0);

        // Replace the character in the string
        String replacedString = replaceCharacter(inputString, oldChar, newChar);

        // Display the result
        System.out.println("Original String: " + inputString);
        System.out.println("Replaced String: " + replacedString);

        scanner.close();
    }

    // Function to replace a specified character in a string
    private static String replaceCharacter(String input, char oldChar, char newChar) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == oldChar) {
                charArray[i] = newChar;
            }
        }

        return new String(charArray);
    }
}
