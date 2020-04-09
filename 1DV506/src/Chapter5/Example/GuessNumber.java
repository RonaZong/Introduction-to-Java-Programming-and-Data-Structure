package Chapter5.Example;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.print("Guess a magic number between 0 and 100");

        // Loop
        // 1. Identify the statements that need to be repeated.
        // 2. Wrap these statements in a loop
        int guess = -1;
        while (guess != i) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == i)
                System.out.println("Yes, the number is " + i);
            else if (guess > i)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }

        input.close();
    }
}