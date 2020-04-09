package Chapter6.Exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer = input.nextInt();

        if (isPalindrome(integer))
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");

        input.close();
    }

    public static int reverse(int number) {
        int reverse = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}