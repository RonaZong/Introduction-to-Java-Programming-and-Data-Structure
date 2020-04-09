package Chapter4.Example;

import java.util.Scanner;

public class ExampleP150 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase letter");
        else if (ch >= 'a' && ch <= 'a')
            System.out.println(ch + " is an lowercase letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is an numeric letter");

        input.close();
    }
}
