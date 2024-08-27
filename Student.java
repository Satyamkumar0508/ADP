// Define the interface DetailInfo
interface DetailInfo {
    // Method declarations
    void display();
    int count();
}

// Implement the interface in the Student class
class Student implements DetailInfo {
    // Static data member
    static int maxcount;

    // Instance variable
    String name;

    // Setter method to assign value to the instance variable
    void setter(String name) {
        this.name = name;
    }

    // Getter method to display the name of the student
    String getter() {
        return name;
    }

    // Implement the display() method from DetailInfo interface
    @Override
    public void display() {
        System.out.println("Student Name: " + name);
    }

    // Implement the count() method from DetailInfo interface
    @Override
    public int count() {
        // Count the number of characters in the name and update maxcount
        maxcount = name.length();
        return maxcount;
    }

    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student();

        // Set the name of the student
        student.setter("John Doe");

        // Display the student details
        student.display();

        // Count and display the number of characters in the name
        int charCount = student.count();
        System.out.println("Number of characters in the name: " + charCount);
    }
}



