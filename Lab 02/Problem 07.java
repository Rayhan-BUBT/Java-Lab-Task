public class Football {
    private int radius;
    private int weight;

    // Parameterized constructor
    public Football(int radius, int weight) {
        this.radius = radius;
        this.weight = weight;
    }

    // Default constructor with default values if no values are given
    public Football() {
        this.radius = 1;
        this.weight = 2;
    }

    // Member function to display values
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        // Create object ob1 with specified values
        Football ob1 = new Football(10, 20);

        // Create object ob2 with default values
        Football ob2 = new Football();

        // Display values of ob1
        System.out.println("Values of ob1:");
        ob1.display();

        // Display values of ob2
        System.out.println("\nValues of ob2:");
        ob2.display();
    }
}