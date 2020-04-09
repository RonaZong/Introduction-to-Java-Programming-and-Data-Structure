package Chapter8.Exercise;

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = random.nextInt(2);
                System.out.print(matrix[i][k]);
                if (k == matrix[i].length - 1) {
                    System.out.println();
                }
            }
        }

        System.out.println("The largest row index: " + row(matrix));
        System.out.println("The largest column index: " + column(matrix));

    }


    public static int row(int[][] matrix) {
        int maxRow = 0;
        int indexOfMaxRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            int totalOfThisRow = 0;
            for (int k = 0; k < matrix[i].length; k++) {
                totalOfThisRow += matrix[i][k];
            }
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = i;
            }
        }
        return indexOfMaxRow;
    }

    public static int column(int[][] matrix) {
        int maxColumn = 0;
        int indexOfMaxColumn = 0;
        for (int i = 0; i < matrix.length; i++) {
            int totalOfThisColumn = 0;
            for (int k = 0; k < matrix[i].length; k++) {
                totalOfThisColumn += matrix[k][i];
            }
            if (totalOfThisColumn > maxColumn) {
                maxColumn = totalOfThisColumn;
                indexOfMaxColumn = i;
            }
        }
        return indexOfMaxColumn;
    }
}
