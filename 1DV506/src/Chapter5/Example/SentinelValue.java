package Chapter5.Example;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        //Loop
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (the input ends if it is 0: ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0) {
            sum += data;

            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);

        input.close();
    }

    public static void main(int[] args) {
        // do-while Loop
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter an integer ( the input ends if it i 0): ");
            data = input.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);

        input.close();
    }
}
