import java.util.Scanner;

public class SecondMostFrequentChar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Result result = findSecondMostFrequentChar(inputString);

        System.out.println("Second most frequent character: " + result.character);
        System.out.println("Number of occurrences: " + result.count);

        scanner.close();
    }

    private static class Result {
        char character;
        int count;

        public Result(char character, int count) {
            this.character = character;
            this.count = count;
        }
    }

    private static Result findSecondMostFrequentChar(String input) {
        // Remove spaces and convert the string to lowercase
        String cleanedString = input.replaceAll("\\s", "").toLowerCase();

        // ASCII range for characters
        final int ASCII_SIZE = 256;

        // Create an array to store the frequency of each character
        int[] charFrequencyArray = new int[ASCII_SIZE];

        // Populate the array with character frequencies
        for (char ch : cleanedString.toCharArray()) {
            charFrequencyArray[ch]++;
        }

        // Find the first and second most frequent characters
        char firstMostFrequent = ' ';
        char secondMostFrequent = ' ';
        int maxFrequency = 0;
        int secondMaxFrequency = 0;

        for (int i = 0; i < ASCII_SIZE; i++) {
            if (charFrequencyArray[i] > maxFrequency) {
                secondMostFrequent = firstMostFrequent;
                secondMaxFrequency = maxFrequency;

                firstMostFrequent = (char) i;
                maxFrequency = charFrequencyArray[i];
            } else if (charFrequencyArray[i] > secondMaxFrequency && charFrequencyArray[i] < maxFrequency) {
                secondMostFrequent = (char) i;
                secondMaxFrequency = charFrequencyArray[i];
            }
        }

        return new Result(secondMostFrequent, secondMaxFrequency);
    }
}
