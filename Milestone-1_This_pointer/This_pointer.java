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

    // Method to return the current object for method chaining
    public Student updateName(String name) {
        this.name = name;
        return this; // 'this' returns the current object
    }

    // display details Method
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

// Main class
public class This_pointer {
    public static void main(String[] args) {
        // Student object
        Student student = new Student("panther", 20);

        // Display initial details
        student.displayDetails();

        // Update details using the updateDetails method
        student.updateDetails("harry", 22);
        student.displayDetails();

        // Update name using method chaining and display details again

        student.updateName("black").displayDetails();
    }
}
