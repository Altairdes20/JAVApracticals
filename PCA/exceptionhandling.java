class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

class AgeCalculator {
    public static int calculateAge(int birthYear, int currentYear) throws AgeValidationException {
        int age = currentYear - birthYear;

        if (age < 0) {
            throw new AgeValidationException("Invalid age: Birth year cannot be in the future.");
        }

        return age;
    }
}

public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int birthYear = 1990;
            int currentYear = 2023;

            int age = AgeCalculator.calculateAge(birthYear, currentYear);
            System.out.println("Calculated Age: " + age);

            // Simulate an invalid scenario
            int futureBirthYear = 2030;
            int invalidAge = AgeCalculator.calculateAge(futureBirthYear, currentYear);
            System.out.println("This line will not be reached if an exception is thrown for invalid age.");
        } catch (AgeValidationException e) {
            System.out.println("Age calculation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
