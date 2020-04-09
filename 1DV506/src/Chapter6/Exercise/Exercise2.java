package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = input.nextInt();

        System.out.print(sumDigits(integer));

        input.close();
    }

    public static int sumDigits(long n) {
        int digit;
        int sumDigits = 0;

        for (int i = 1; n != 0; i++) {
            digit = (int) n % 10;
            sumDigits += digit;
            n = n / 10;
        }

        return sumDigits;
    }
}
