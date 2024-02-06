public class FoodOrder {
    
    // Function to order food with two items
    public void orderFood(String food1, int quantity1, String food2, int quantity2) {
        System.out.println("Order placed for " + quantity1 + " " + food1 + " and " + quantity2 + " " + food2);
    }

    // Function to order food with three items
    public void orderFood(String food1, int quantity1, String food2, int quantity2, String food3, int quantity3) {
        System.out.println("Order placed for " + quantity1 + " " + food1 + ", " + quantity2 + " " + food2 + ", and " + quantity3 + " " + food3);
    }

    // Function to order food with four items
    public void orderFood(String food1, int quantity1, String food2, int quantity2, String food3, int quantity3, String food4, int quantity4) {
        System.out.println("Order placed for " + quantity1 + " " + food1 + ", " + quantity2 + " " + food2 + ", " + quantity3 + " " + food3 +
                ", and " + quantity4 + " " + food4);
    }

    public static void main(String[] args) {
        // Example usage
        FoodOrder foodOrder = new FoodOrder();

        // Ordering two items
        foodOrder.orderFood("Burger", 2, "Pizza", 1);

        // Ordering three items
        foodOrder.orderFood("Sushi", 3, "Salad", 1, "Fries", 2);

        // Ordering four items
        foodOrder.orderFood("Pasta", 2, "Chicken Wings", 1, "Coke", 3, "Ice Cream", 2);
    }
}