package Chapter9.Exercise.Exercise10;

import java.util.Scanner;

public class LocationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and column in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();

        System.out.println("Enter the array: ");
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < column; k++) {
                array[i][k] = input.nextDouble();
            }
        }

        System.out.println("The location of the largest element is " + locateLargest(array).getMaxValue() +
                " at " + locateLargest(array).row + ", " + locateLargest(array).getColumn());

        input.close();
    }

    public static Location locateLargest(double[][] doubles) {
        Location highest = new Location(-1, -1, Double.MIN_VALUE);
        for (int i = 0; i < doubles.length; i++) {
            for (int k = 0; k < doubles[i].length; k++) {
                double value = doubles[i][k];
                if (value > highest.getMaxValue()) {
                    highest = new Location(i, k, value);
                }
            }
        }
        return highest;
    }
}
