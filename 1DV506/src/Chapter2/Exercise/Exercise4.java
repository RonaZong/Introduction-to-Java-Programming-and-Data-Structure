package Chapter2.Exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in square meters: ");
        double meters = input.nextDouble();
        double pings = meters * 0.3025;
        System.out.println(meters + " square meters is " + pings + " pings");

        input.close();
    }

}
