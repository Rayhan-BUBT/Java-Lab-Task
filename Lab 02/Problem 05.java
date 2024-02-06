public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Parameterized constructor
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Function to add two time objects and return the result as a new object
    public Time addTime(Time t1, Time t2) {
        Time sumTime = new Time();

        sumTime.seconds = t1.seconds + t2.seconds;
        sumTime.minutes = t1.minutes + t2.minutes + sumTime.seconds / 60;
        sumTime.hours = t1.hours + t2.hours + sumTime.minutes / 60;

        sumTime.seconds %= 60;
        sumTime.minutes %= 60;

        return sumTime;
    }

    // Function to display the time in 11:59:59 format
    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Create two time objects
        Time time1 = new Time(2, 55, 40);
        Time time2 = new Time(5, 20, 30);

        // Create a third time object by adding the first two
        Time resultTime = new Time().addTime(time1, time2);

        // Display the result time
        System.out.println("Output:");
        resultTime.display();
    }
}