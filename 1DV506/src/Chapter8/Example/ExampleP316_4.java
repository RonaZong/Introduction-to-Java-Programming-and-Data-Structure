package Chapter8.Example;

public class ExampleP316_4 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
    }
}
