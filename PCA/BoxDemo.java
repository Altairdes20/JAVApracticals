class Box {
    // Data members
    double length;
    double breadth;
    double height;
    double volume;

    // Constructors
    // (a) No argument constructor
    public Box() {
        length = 0.0;
        breadth = 0.0;
        height = 0.0;
        calculateVolume();
    }

    // (b) One argument constructor
    public Box(double side) {
        length = side;
        breadth = side;
        height = side;
        calculateVolume();
    }

    // (c) Three arguments constructor
    public Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
        calculateVolume();
    }

    // Member function to calculate volume
    private void calculateVolume() {
        volume = length * breadth * height;
    }

    // Member function to display volume
    public void display() {
        System.out.println("Volume of the box: " + volume);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        // Create objects of Box class using different constructors
        Box box1 = new Box();          // No argument constructor
        Box box2 = new Box(5.0);       // One argument constructor
        Box box3 = new Box(2.0, 3.0, 4.0); // Three arguments constructor

        // Display volumes
        box1.display();
        box2.display();
        box3.display();
    }
}
