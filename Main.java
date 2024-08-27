// Abstract class Marks
abstract class Marks {
    // Instance variables
    int markICP;
    int markDSA;
    double percentage;

    // Abstract method to be implemented by derived classes
    abstract void getPercentage();
}

// CSE class that extends Marks
class CSE extends Marks {
    // Additional instance variable
    int algoDesign;

    // Constructor to initialize marks
    CSE(int markICP, int markDSA, int algoDesign) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }

    // Override getPercentage method to calculate percentage for CSE students
    @Override
    void getPercentage() {
        // Calculate the percentage
        this.percentage = (markICP + markDSA + algoDesign) / 3.0;
    }

    // Method to display the percentage
    void displayPercentage() {
        System.out.println("CSE Student Percentage: " + percentage + "%");
    }
}

// NonCSE class that extends Marks
class NonCSE extends Marks {
    // Additional instance variable
    int enggMechanics;

    // Constructor to initialize marks
    NonCSE(int markICP, int markDSA, int enggMechanics) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }

    // Override getPercentage method to calculate percentage for Non-CSE students
    @Override
    void getPercentage() {
        // Calculate the percentage
        this.percentage = (markICP + markDSA + enggMechanics) / 3.0;
    }

    // Method to display the percentage
    void displayPercentage() {
        System.out.println("Non-CSE Student Percentage: " + percentage + "%");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create a CSE student object and calculate percentage
        CSE cseStudent = new CSE(85, 90, 88);
        cseStudent.getPercentage();
        cseStudent.displayPercentage();

        // Create a Non-CSE student object and calculate percentage
        NonCSE nonCSEStudent = new NonCSE(80, 75, 82);
        nonCSEStudent.getPercentage();
        nonCSEStudent.displayPercentage();
    }
}