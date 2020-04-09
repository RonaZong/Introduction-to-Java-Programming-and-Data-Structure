package Chapter8.Example;

public class ExampleP315_3 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }

            System.out.println();
        }
    }
}
