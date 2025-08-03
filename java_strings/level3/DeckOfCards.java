import java.util.Scanner;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static int numOfCards = suits.length * ranks.length;

    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap deck[i] and deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n > deck.length) {
            System.out.println("Cannot distribute more cards than available in deck.");
            return null;
        }
        if (n % x != 0) {
            System.out.println("Cannot distribute cards evenly among players.");
            return null;
        }
        int cardsPerPlayer = n / x;
        String[][] playersCards = new String[x][cardsPerPlayer];

        int cardIndex = 0;
        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < x; j++) {
                playersCards[j][i] = deck[cardIndex++];
            }
        }

        return playersCards;
    }

    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) {
            System.out.println("No cards distributed.");
            return;
        }
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playersCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        shuffleDeck(deck);

        System.out.println("Total cards in deck: " + deck.length);

        System.out.print("Enter number of cards to distribute: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of players: ");
        int x = scanner.nextInt();

        String[][] distributedCards = distributeCards(deck, n, x);
        printPlayersCards(distributedCards);

        scanner.close();
    }
}

