public class Factors {
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[idx++] = i;
        }
        return factors;
    }
    public static int getGreatestFactor(int number, int[] factors) {
        int greatest = 1;
        for (int f : factors) {
            if (f != number && f > greatest) greatest = f;
        }
        return greatest;
    }
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }
    public static long productFactors(int[] factors) {
        long prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }
    public static double productOfCubes(int[] factors) {
        double prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) fact *= i;
        return fact;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 28;

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest factor (excluding itself): " + getGreatestFactor(number, factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));
        System.out.println("Is perfect number? " + isPerfectNumber(number));
        System.out.println("Is abundant number? " + isAbundant(number));
        System.out.println("Is deficient number? " + isDeficient(number));
        System.out.println("Is strong number? " + isStrongNumber(number));
    }
}
