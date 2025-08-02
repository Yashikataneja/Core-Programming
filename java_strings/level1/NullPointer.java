public class NullPointer {
    public static void generateNullPointer() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught! The string is null.");
        }
    }

    public static void main(String[] args) {

        handleNullPointer();
    }
}
