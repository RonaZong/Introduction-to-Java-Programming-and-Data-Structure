package Chapter8.Exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        double[][] a = new double[2][2];
        double[][] b = new double[a.length][a[0].length];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                a[row][column] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int row = 0; row < b.length; row++) {
            for (int column = 0; column < b[row].length; column++) {
                b[row][column] = input.nextDouble();
            }
        }

        System.out.println("The matrices are added as follows");
        double[][] c = addMatrix(a, b);
        for (int row = 0; row < a.length; row++) {
            for (int columnA = 0; columnA < a[row].length; columnA++) {
                System.out.print(a[row][columnA] + " ");
                if ((columnA == a[row].length - 1) && (row == a.length - 1))
                    System.out.print(" + ");
            }
            System.out.print("\t");
            for (int columnB = 0; columnB < b[row].length; columnB++) {
                System.out.print(b[row][columnB] + " ");
                if ((columnB == b[row].length - 1) && (row == a.length - 1))
                    System.out.print(" = ");
            }
            System.out.print("\t");
            for (int columnC = 0; columnC < c[row].length; columnC++) {
                System.out.print(c[row][columnC] + " ");
            }
            System.out.println();
        }
        input.close();
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];
        for (int row = 0; row < c.length; row++) {
            for (int column = 0; column < c[row].length; column++) {
                c[row][column] = a[row][column] + b[row][column];
            }
        }
        return c;
    }
}
