package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);

        input.close();
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num3 > num2 && num3 > num1) {
            if (num2 > num1) {
                System.out.printf("%f %f %f", num3, num2, num1);
            }
            else
                System.out.printf("%f %f %f", num3, num1, num2);
        }
        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.printf("%f %f %f", num2, num1, num3);
            }
            else
                System.out.printf("%f %f %f", num2, num3, num1);
        }
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.printf("%f %f %f", num1, num2, num3);
            }
            else
                System.out.printf("%f %f %f", num1, num3, num2);
        }
    }
}
