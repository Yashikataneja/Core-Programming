public class RandomArray{
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[] {0.0, 0.0, 0.0};
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.print("Generated 4-digit random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();


        double[] stats = findAverageMinMax(randomNumbers);

        System.out.printf("Average value: %.2f%n", stats[0]);
        System.out.println("Minimum value: " + (int)stats[1]);
        System.out.println("Maximum value: " + (int)stats[2]);
    }
}
