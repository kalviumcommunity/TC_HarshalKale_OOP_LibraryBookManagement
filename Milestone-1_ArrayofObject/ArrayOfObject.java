class Student {
    private String name;
    private int age;

    // Constructor using 'this' to resolve name conflicts
    public Student(String name, int age) {
        this.name = name; // Refers to the instance variable 'name'
        this.age = age; // Refers to the instance variable 'age'
    }

    // Method to update both name and age
    public void updateDetails(String name, int age) {
        this.name = name; // 'this' resolves conflict with local variable 'name'
        this.age = age; // 'this' resolves conflict with local variable 'age'
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        // Initialize the array using the constructor
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 18);

        // Display initial details of all students
        System.out.println("Initial Student Details:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println("---------------------");
        }

        // Update details of one student using updateDetails method
        students[1].updateDetails("Bob Jr.", 23);

        // Display updated details
        System.out.println("Updated Student Details:");
        for (Student student : students) {
            student.displayDetails();
            System.out.println("---------------------");
        }
    }
}
