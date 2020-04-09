package Chapter8.Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        System.out.println("Average of the elements in the major diagonal is " + averageMajorDiagonal(matrix));
        input.close();
    }

    public static double averageMajorDiagonal(double[][] m) {
        double sum1 = 0, sum2 = 0;
        for (int row = 0; row < m.length; row++) {
            sum1 += m[row][row];
        }

        for (int row = 0; row < m.length; row++) {
            sum2 += m[row][m.length - row - 1];
        }

        return (sum1 + sum2) / (m.length * 2);
    }
}
