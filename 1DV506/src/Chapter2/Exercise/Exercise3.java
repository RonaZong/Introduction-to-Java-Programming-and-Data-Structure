package Chapter2.Exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for meter: ");
        double meter = input.nextDouble();
        double feet = meter * 3.2786;

        System.out.println(meter + " meters is " + feet + " feet");

        input.close();
    }
}
