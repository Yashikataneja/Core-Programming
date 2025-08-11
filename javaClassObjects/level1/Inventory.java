class Item {

    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Inventory {
    public static void main(String[] args) {
        // Create item object
        Item item1 = new Item();
        item1.itemCode = 101;
        item1.itemName = "Notebook";
        item1.price = 50.0;

        // Display item details
        item1.displayDetails();

        int quantity = 5;
        double totalCost = item1.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
