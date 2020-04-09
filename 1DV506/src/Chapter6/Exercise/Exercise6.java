package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise6 {
    // Not Done

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numberOfRows = input.nextInt();

        displayPattern(numberOfRows);

        input.close();
    }

    public static void displayPattern(int n) {
        int padding = n - 1; // Number of whitespace

        for (int i = 1; i <= n; i++) {
            // Print padding
            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int r = i; r > 0; r--) {
                System.out.print(i + " ");
            }

            System.out.println();
            padding--;
        }
    }
}
