class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double cost, int qty) {
        itemName = name;
        price = cost;
        quantity = qty;
        System.out.println(qty + " x " + name + " added to the cart.");
    }

    void removeItem() {
        System.out.println(itemName + " removed from the cart.");
        itemName = "";
        price = 0;
        quantity = 0;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayCart() {
        if (quantity > 0) {
            System.out.println("Item: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + getTotalCost());
        } else {
            System.out.println("Cart is empty.");
        }
    }
}

public class Shopping {
    public static void main(String[] args) {
        CartItem cart = new CartItem();

        cart.addItem("Laptop", 55000.00, 1);
        cart.displayCart();

        System.out.println("-----------------");

        cart.removeItem();
        cart.displayCart();
    }
}

