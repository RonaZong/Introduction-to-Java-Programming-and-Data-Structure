package Chapter8.Exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            System.out.println("Sum of the elements at row " + row + " is " + sumRow(matrix, row));
        }

        input.close();
    }

    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
        for (int column = 0; column < m[rowIndex].length; column++) {
            sum += m[rowIndex][column];
        }
        return sum;
    }
}
