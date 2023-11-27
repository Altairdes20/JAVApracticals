class Classroom {
    // Variables
    double height;
    double length;
    double breadth;

    // Method to get values
    public void getValues() {
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    // Method to calculate volume
    public double calculateVolume() {
        return height * length * breadth;
    }
}

public class ClassroomDemo {
    public static void main(String[] args) {
        // Create an object of Classroom
        Classroom myClassroom = new Classroom();

        // Set values for the classroom
        myClassroom.height = 5;
        myClassroom.length = 6;
        myClassroom.breadth = 7;

        // Print values
        System.out.println("Classroom Details:");
        myClassroom.getValues();

        // Calculate and print volume
        double volume = myClassroom.calculateVolume();
        System.out.println("Volume of the classroom: " + volume);
    }
}
