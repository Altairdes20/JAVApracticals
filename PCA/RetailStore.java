import java.util.Scanner;

public class RetailStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Bill Amount
        System.out.print("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();

        // Calculate discount
        double discount = 0.0;

        if (billAmount >= 50000) {
            discount = 0.15;
        } else if (billAmount >= 25000) {
            discount = 0.10;
        } else if (billAmount >= 10000) {
            discount = 0.05;
        } else if (billAmount >= 5000) {
            discount = 0.02;
        }

        // Calculate net amount to be paid
        double discountedAmount = billAmount - (billAmount * discount);

        // Output: Net amount to be paid
        System.out.println("Discounted Amount: " + discountedAmount);
        
        scanner.close();
    }
}
