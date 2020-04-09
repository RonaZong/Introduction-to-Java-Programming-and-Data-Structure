package Chapter3.Exercise;

import java.util.Scanner;

public class ExerciseP125 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Today is Tuesday. Enter in how many days:");
        int days = input.nextInt();
        int day = days % 7;

        if (day == 0)
            System.out.println("If today is Tuesday, in " + days + " days is Tuesday");
        else if (day == 1)
            System.out.println("If today is Tuesday, in " + days + " days is Wednesday");
        else if (day == 2)
            System.out.println("If today is Tuesday, in " + days + " days is Thursday");
        else if (day == 3)
            System.out.println("If today is Tuesday, in " + days + " days is Friday");
        else if (day == 4)
            System.out.println("If today is Tuesday, in " + days + " days is Saturday");
        else if (day == 5)
            System.out.println("If today is Tuesday, in " + days + " days is Sunday");
        else if (day == 6)
            System.out.println("If today is Tuesday, in " + days + " days is Monday");

        input.close();
    }
}
