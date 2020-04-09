package Chapter8.Example;

public class ExampleP315_2 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }
    }
}
