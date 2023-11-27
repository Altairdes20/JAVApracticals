import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the mobile number from the user
        System.out.print("Enter an Indian mobile number: ");
        String mobileNumber = scanner.nextLine();

        // Check if the entered number is valid
        if (isValidIndianMobileNumber(mobileNumber)) {
            System.out.println("The entered mobile number is valid.");
        } else {
            System.out.println("Invalid mobile number. Please enter a valid Indian mobile number.");
        }

        scanner.close();
    }

    private static boolean isValidIndianMobileNumber(String mobileNumber) {
        // Regular expression for a valid Indian mobile number
        String regex = "^[6-9]\\d{9}$";

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Check if the mobile number matches the pattern
        return pattern.matcher(mobileNumber).matches();
    }
}
