package Chapter5.Example;

import java.util.Scanner;

public class Example7 {
    // P192
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_INPUT = 5;
        int count = 1;
        System.out.print("Enter 5 integers: ");

        int number, max;
        number = input.nextInt();
        max = number;

        while (count < NUMBER_OF_INPUT) {
            number = input.nextInt();
            if (number > max)
                max = number;

            count++;
        }

        System.out.println("Max is " + max);
        System.out.println("Last number is " + number);

        input.close();
    }
}
