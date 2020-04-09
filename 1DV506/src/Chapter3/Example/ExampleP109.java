package Chapter3.Example;

import java.util.Scanner;

public class ExampleP109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is even");
        if (number % 5 == 0)  // different output for "else if" when number = 30
            System.out.println(number + " is multiple of 5");

        input.close();
    }
}
