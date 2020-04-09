package Chapter8.Example;

import java.util.Scanner;

public class ExampleP315_1 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " row and "+ matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        input.close();
    }
}
