class Circle {
    double radius;

    // area
    double calculateArea() {
        return 3.14159 * radius * radius; // πr²
    }

    // circumference
    double calculateCircumference() {
        return 2 * 3.14159 * radius; // 2πr
    }

    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleDetails {
    public static void main(String[] args) {
        //  Circle object
        Circle c1 = new Circle();

        // Assign radius
        c1.radius = 5; // Example radius

        c1.displayDetails();
    }
}
