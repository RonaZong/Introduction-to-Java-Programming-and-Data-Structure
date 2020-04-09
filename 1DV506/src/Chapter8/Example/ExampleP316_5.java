package Chapter8.Example;

public class ExampleP316_5 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is " + total);
        }
    }
}
