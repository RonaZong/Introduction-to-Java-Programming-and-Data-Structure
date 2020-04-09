package Chapter2.Exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        double integer = input.nextDouble();
        double single = integer % 10;
        double tenth = (integer - single) % 100;
        double hundredth = integer - tenth - single;
        double multiplication = (hundredth / 100) * (tenth / 10) * single;

        System.out.println("The multiplication of all digits in " + integer + " is " + multiplication);

        input.close();
    }
}
