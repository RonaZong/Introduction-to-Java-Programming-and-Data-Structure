package Chapter8.Exercise;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // not done
        Scanner input = new Scanner(System.in);
        String[][] grid = new String[4][4];
        String[][] player1 = new String[3][3];
        String[][] player2 = new String[3][3];
        int x = 0;
        int row1;
        int column1;
        int row2;
        int column2;


        for (int i = 0; i < grid.length - 1; i++) {
            System.out.println("-------------");
            for (int k = 0; k < grid[i].length; k++) {
                System.out.print("|\t");
            }
            System.out.println();
        }
        System.out.println("-------------");


        while (x != -1) {
            if (x % 2 == 0) {
                System.out.print("Enter a row (0, 1, or 2) for player X: ");
                row1 = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player X: ");
                column1 = input.nextInt();
                player1[row1][column1] = "X";

                for (int j = 0; j < grid.length - 1; j++) {
                    System.out.println("-------------");
                    for (int q = 0; q < grid[j].length; q++) {
                        if (row1 == j && column1 == q) {
                            System.out.print("| " + player1[row1][column1] + " ");
                        } else
                            System.out.print("|\t");
                    }
                    System.out.println();
                }
                System.out.println("-------------");

                x += 1;
            }
            else if ((x + 1) % 2 == 0) {
                System.out.print("Enter a row (0, 1, or 2) for player X: ");
                row2 = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player X: ");
                column2 = input.nextInt();
                player2[row2][column2] = "O";

                for (int j = 0; j < grid.length - 1; j++) {
                    System.out.println("-------------");
                    for (int q = 0; q < grid[j].length; q++) {
                        if (row2 == j && column2 == q) {
                            System.out.print("| " + player2[row2][column2] + " ");
                        } else
                            System.out.print("|\t");
                    }
                    System.out.println();
                }
                System.out.println("-------------");

                x += 1;
            }

        }
        input.close();
    }

//    public static void grid(String[][] grid) {
//        for (int i = 0; i < grid.length - 1; i++) {
//            System.out.println("-------------");
//            for (int k = 0; k < grid[i].length; k++) {
//                System.out.print("|\t");
//            }
//            System.out.println();
//        }
//        System.out.println("-------------");
//    }



}
