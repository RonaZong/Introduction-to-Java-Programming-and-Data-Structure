package Chapter3.Example;

import java.util.Scanner;

public class ExampleP125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a weekday number: ");
        int dayNumber = scan.nextInt();

        String weekDay;
        switch (dayNumber) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            default:
                weekDay = "Incorrect weekday number";
        }
        System.out.println("Weekday: " + weekDay);

        scan.close();
    }
}