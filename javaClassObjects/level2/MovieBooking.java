class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movie, String seat, double cost) {
        movieName = movie;
        seatNumber = seat;
        price = cost;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        ticket1.bookTicket("Inception", "A12", 250.00);
        ticket1.displayTicket();

        System.out.println("----------------");

        MovieTicket ticket2 = new MovieTicket();
        ticket2.bookTicket("Avengers: Endgame", "B7", 300.00);
        ticket2.displayTicket();
    }
}

