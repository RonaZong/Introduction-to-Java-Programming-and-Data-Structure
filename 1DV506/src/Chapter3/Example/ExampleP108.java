package Chapter3.Example;

import java.util.Scanner;

public class ExampleP108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        boolean even = number % 2 == 0;
        System.out.println(even);

        input.close();
    }
}
