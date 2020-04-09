package Chapter2.Exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double minutes = input.nextDouble();
        double years = minutes / (60 * 24 * 365);
        double remainingDays = minutes % (60 * 24 * 365);
        double days = remainingDays / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + (int)years + " years and " + (int)days + " days");

        input.close();
    }
}
