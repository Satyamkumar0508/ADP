class Product {
    // Member variables
    int prodId;
    double price;
    int quantity;
    
    // Static variable to hold the total price of all products
    static double totalPrice = 0;

    // Parameterized constructor to initialize member variables
    Product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        // Calculate the total price for this product and add it to the totalPrice
        totalPrice += (price * quantity);
    }

    // Method to display the product details
    void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price for this Product: $" + (price * quantity));
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating 5 different Product objects
        Product prod1 = new Product(101, 10.50, 2);
        Product prod2 = new Product(102, 5.75, 5);
        Product prod3 = new Product(103, 3.25, 4);
        Product prod4 = new Product(104, 7.40, 3);
        Product prod5 = new Product(105, 2.99, 10);

        // Displaying the details of each product
        System.out.println("Details of Products Purchased:");
        prod1.display();
        prod2.display();
        prod3.display();
        prod4.display();
        prod5.display();

        // Displaying the total amount to be paid
        System.out.println("Total Amount to be Paid: $" + totalPrice);
    }
}
