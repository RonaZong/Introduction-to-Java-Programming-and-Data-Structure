package Chapter7.Example;

import java.util.Scanner;

public class ExampleP274_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"January", " February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);

        input.close();
    }
}
