import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an integer array of size 10
        int[] numbers = new int[10];

        // Initialize the array with user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum and minimum values
        int max = findMax(numbers);
        int min = findMin(numbers);

        // Display the results
        System.out.println("Array values:");
        displayArray(numbers);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        scanner.close();
    }

    // Function to find the maximum value in an array
    private static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Function to find the minimum value in an array
    private static int findMin(int[] arr) {
        int min = arr[0]; // Assume the first element is the minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // Function to display the elements of an array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
