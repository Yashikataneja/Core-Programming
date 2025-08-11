class Employee {
    // Attributes
    String name;
    int id;
    double salary;
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        /*first employee*/
        Employee emp1 = new Employee();
        emp1.name = "John Doe";
        emp1.id = 101;
        emp1.salary = 55000.50;

        // second employee
        Employee emp2 = new Employee();
        emp2.name = "Jane Smith";
        emp2.id = 102;
        emp2.salary = 60000.00;

        emp1.displayDetails();
        System.out.println("-------------------");
        emp2.displayDetails();
    }
}
