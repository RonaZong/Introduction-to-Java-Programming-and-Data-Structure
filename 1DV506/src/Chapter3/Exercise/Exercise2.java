package Chapter3.Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = (int)(Math.random() * 10);
        int y = (int)(Math.random() * 10);
        int z = (int)(Math.random() * 10);

        System.out.print("What is " + x + " * " + y + " * " + z + "?");
        int answer = input.nextInt();

        System.out.println("Your answer is " + (x * y * z == answer));

        input.close();
    }
}
