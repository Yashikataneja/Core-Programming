class Student {
    String name;
    int rollNumber;
    double marks;

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        // student object
        Student s1 = new Student();
        s1.name = "Rahul Sharma";
        s1.rollNumber = 101;
        s1.marks = 85;

        // Display report
        s1.displayDetails();
    }
}
