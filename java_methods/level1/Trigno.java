public class Trigno{
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // degrees to radians

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        double angleInDegrees = 45.0;
        double[] trigValues = calculateTrigonometricFunctions(angleInDegrees);

        System.out.println("Angle: " + angleInDegrees + " degrees");
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }
}
