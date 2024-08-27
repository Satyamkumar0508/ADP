// Base class
class Employee1{
    // Instance variables
    String name;
    int age;

    // Constructor to initialize Employee instance variables
    Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Derived class
class HR extends Employee1 {
    // Additional instance variables for HR
    int Eid;
    double salary;

    // Constructor to initialize HR instance variables along with inherited Employee variables
    HR(String name, int age, int Eid, double salary) {
        // Call the base class constructor to initialize name and age
        super(name, age);
        // Initialize HR specific variables
        this.Eid = Eid;
        this.salary = salary;
    }

    // Method to display HR details
    void DisplayDetails() {
        System.out.println("HR Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Create an HR object and initialize it
        HR hr = new HR("John Doe", 30, 1001, 75000.00);

        // Display the HR details
        hr.DisplayDetails();
    }
}
