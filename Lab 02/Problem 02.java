import java.util.Scanner;

public class Complex {
    private int real;
    private int imag;

    // Default constructor
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    // Parameterized constructor
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Function to read input from the keyboard
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real and imaginary numbers respectively: ");
        this.real = scanner.nextInt();
        this.imag = scanner.nextInt();
    }

    // Function to add two complex numbers and return the result as a new object
    public Complex add(Complex other) {
        int sumReal = this.real + other.real;
        int sumImag = this.imag + other.imag;
        return new Complex(sumReal, sumImag);
    }

    // Function to display the complex number
    public void display() {
        System.out.println("Sum = " + this.real + " + " + this.imag + "i");
    }

    public static void main(String[] args) {
        // Create two instances of the Complex class
        Complex complex1 = new Complex();
        Complex complex2 = new Complex();

        // Read input for both complex numbers
        complex1.read();
        complex2.read();

        // Add the complex numbers and display the result
        Complex sumResult = complex1.add(complex2);
        sumResult.display();
    }
}