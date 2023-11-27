public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("First " + n + " numbers of Fibonacci series:");

        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
