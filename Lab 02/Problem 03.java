import java.util.Scanner;

public class Box {
    private double length;
    private double width;
    private double height;

    // Default constructor
    public Box() {
        this.length = 10.0;
        this.width = 12.0;
        this.height = 8.0;
    }

    // Parameterized constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Function to check and adjust the dimensions of the box
    public void adjustDimensions() {
        if (length != 10.0) {
            // If length is not 10 meters, adjust it
            length = Math.max(10.0, length); // Ensure length is at least 10 meters
        }

        if (width != 12.0) {
            // If width is not 12 meters, adjust it
            width = Math.max(12.0, width); // Ensure width is at least 12 meters
        }

        if (height != 8.0) {
            // If height is not 8 meters, adjust it
            height = Math.max(8.0, height); // Ensure height is at least 8 meters
        }
    }

    // Function to display the dimensions of the box
    public void displayDimensions() {
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Height: " + height + " meters");
    }

    public static void main(String[] args) {
        // Create an instance of the Box class
        Box box = new Box();

        // Display the initial dimensions
        System.out.println("Initial Box Dimensions:");
        box.displayDimensions();

        // Ask the user for input to simulate different box dimensions
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter new dimensions (length width height): ");
        double newLength = scanner.nextDouble();
        double newWidth = scanner.nextDouble();
        double newHeight = scanner.nextDouble();

        // Update box dimensions
        box = new Box(newLength, newWidth, newHeight);
        box.adjustDimensions();

        // Display the adjusted dimensions
        System.out.println("\nAdjusted Box Dimensions:");
        box.displayDimensions();
    }
}