class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        // first mobile phone object
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Apple";
        phone1.model = "iPhone 15 Pro";
        phone1.price = 149999.00;

        // second mobile phone object
        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S24 Ultra";
        phone2.price = 139999.00;

        // Display details of first phone
        phone1.displayDetails();
        System.out.println("-------------------");

        // Display details of second phone
        phone2.displayDetails();
    }
}

