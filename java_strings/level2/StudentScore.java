import java.util.Random;

public class StudentScore {
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        Random rand = new Random();
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100); // 0 to 99 inclusive
            }
        }
        return scores;
    }

    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        int maxMarks = 300; // 3 subjects * 100 marks each

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total * 100.0) / maxMarks;


            average = Math.round(average * 100) / 100.0;
            percentage = Math.round(percentage * 100) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    public static String[] calculateGrades(double[][] percentages) {
        int numStudents = percentages.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percent = percentages[i][2];
            if (percent >= 80) {
                grades[i] = "A";
            } else if (percent >= 70) {
                grades[i] = "B";
            } else if (percent >= 60) {
                grades[i] = "C";
            } else if (percent >= 50) {
                grades[i] = "D";
            } else if (percent >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] totalsAndPercentages, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\t\t%s\n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    (int)totalsAndPercentages[i][0],
                    totalsAndPercentages[i][1],
                    totalsAndPercentages[i][2],
                    grades[i]
            );
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;

        int[][] scores = generateRandomScores(numStudents);

        double[][] totalsAndPercentages = calculateTotalsAndPercentages(scores);


        String[] grades = calculateGrades(totalsAndPercentages);

        displayScorecard(scores, totalsAndPercentages, grades);
    }
}
