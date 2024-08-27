 class Deposit {
    // Instance variables for the Deposit class
    long principal;
    int time;
    double rate;
    double totalAmt;

    // Constructor 1: Default constructor
    Deposit() {
        principal = 0;
        time = 0;
        rate = 0.0;
        totalAmt = 0.0;
    }

    // Constructor 2: Constructor with all three parameters
    Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
        calcAmt(); // Calculate the total amount upon initialization
    }

    // Constructor 3: Constructor with principal and time parameters
    Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        this.rate = 0.0; // Default rate set to 0.0
        calcAmt(); // Calculate the total amount upon initialization
    }

    // Constructor 4: Constructor with principal and rate parameters
    Deposit(long principal, double rate) {
        this.principal = principal;
        this.time = 0; // Default time set to 0
        this.rate = rate;
        calcAmt(); // Calculate the total amount upon initialization
    }

    // Method to calculate the total amount
    void calcAmt() {
        totalAmt = principal + (principal * rate * time) / 100;
    }

    // Method to display the details of the deposit
    void display() {
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + totalAmt);
    }

    public static void main(String[] args) {
        // Test cases to demonstrate the different constructors

        // Using Constructor1: Deposit()
        Deposit deposit1 = new Deposit();
        System.out.println("Using Constructor1:");
        deposit1.display();

        // Using Constructor2: Deposit(long, int, double)
        Deposit deposit2 = new Deposit(10000, 2, 5.5);
        System.out.println("\nUsing Constructor2:");
        deposit2.display();

        // Using Constructor3: Deposit(long, int)
        Deposit deposit3 = new Deposit(5000, 3);
        System.out.println("\nUsing Constructor3:");
        deposit3.display();

        // Using Constructor4: Deposit(long, double)
        Deposit deposit4 = new Deposit(8000, 4.5);
        System.out.println("\nUsing Constructor4:");
        deposit4.display();
    }
}
