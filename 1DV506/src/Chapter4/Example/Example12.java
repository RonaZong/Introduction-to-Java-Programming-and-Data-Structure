package Chapter4.Example;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first programming language? ");
        String L1 = input.nextLine();
        L1 = L1.substring(0, 1).toUpperCase();
        System.out.println(L1);

        input.close();
    }
}
