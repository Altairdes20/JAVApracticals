import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store user input numbers
        int[] numbers = new int[size];

        // Get user input for the array elements
        System.out.println("Enter the numbers!");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
