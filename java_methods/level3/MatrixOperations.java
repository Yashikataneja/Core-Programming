import java.util.*;

public class MatrixOperations {
    static Scanner sc = new Scanner(System.in);
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(90) + 10;
        return mat;
    }
    public static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.printf("%6d", val);
            System.out.println();
        }
    }
    public static int[][] add(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] + B[i][j];
        return res;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] - B[i][j];
        return res;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, n = B.length;
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    res[i][j] += A[i][k] * B[k][j];
        return res;
    }

    public static int[][] transpose(int[][] A) {
        int[][] trans = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                trans[j][i] = A[i][j];
        return trans;
    }

    public static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }
    public static int determinant3x3(int[][] A) {
        int a = A[0][0], b = A[0][1], c = A[0][2];
        int d = A[1][0], e = A[1][1], f = A[1][2];
        int g = A[2][0], h = A[2][1], i = A[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }
    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) return null;
        double[][] inv = {
                { A[1][1], -A[0][1] },
                { -A[1][0], A[0][0] }
        };
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                inv[i][j] /= det;
        return inv;
    }
    public static int cofactor(int[][] mat, int row, int col) {
        int[][] minor = new int[2][2];
        int r = 0, c = 0;
        for (int i = 0; i < 3; i++) {
            if (i == row) continue;
            c = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) continue;
                minor[r][c++] = mat[i][j];
            }
            r++;
        }
        return ((row + col) % 2 == 0 ? 1 : -1) * determinant2x2(minor);
    }
    public static double[][] inverse3x3(int[][] A) {
        int det = determinant3x3(A);
        if (det == 0) return null;

        double[][] cofactorMatrix = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                cofactorMatrix[i][j] = cofactor(A, i, j);
        double[][] adjugate = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                adjugate[i][j] = cofactorMatrix[j][i];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                adjugate[i][j] /= det;

        return adjugate;
    }
    public static void main(String[] args) {
        int[][] A = generateRandomMatrix(3, 3);
        int[][] B = generateRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        System.out.println("\nAddition:");
        printMatrix(add(A, B));

        System.out.println("\nSubtraction:");
        printMatrix(subtract(A, B));

        System.out.println("\nMultiplication:");
        printMatrix(multiply(A, B));

        System.out.println("\nTranspose of A:");
        printMatrix(transpose(A));

        System.out.println("\nDeterminant of A:");
        System.out.println(determinant3x3(A));

        System.out.println("\nInverse of A:");
        double[][] invA = inverse3x3(A);
        if (invA != null)
            printMatrix(invA);
        else
            System.out.println("Matrix A is not invertible.");
    }
}

