package Chapter2.Exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        double kilometers = miles * 1.6;

        System.out.print(miles + " miles is " + kilometers + " kilometers");

        input.close();
    }
}
