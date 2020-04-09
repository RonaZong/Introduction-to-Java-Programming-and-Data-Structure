package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = input.nextInt();

        reverse(integer);

        input.close();
    }

    public static void reverse(int number) {
        int reverse = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.print(reverse);
    }
}
