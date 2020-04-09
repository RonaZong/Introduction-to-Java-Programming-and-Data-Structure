package Chapter7.Example;

import java.util.Scanner;

public class ExampleP273_1 {
    public static void main(String[] args) {
        double[] myList = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + myList.length + " values :");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }

        input.close();
    }
}
