class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        // first book
        Book b1 = new Book();
        b1.title = "The Alchemist";
        b1.author = "Paulo Coelho";
        b1.price = 399.50;

        // second book
        Book b2 = new Book();
        b2.title = "Atomic Habits";
        b2.author = "James Clear";
        b2.price = 499.00;


        b1.displayDetails();
        System.out.println("-------------------");

        b2.displayDetails();
    }
}
