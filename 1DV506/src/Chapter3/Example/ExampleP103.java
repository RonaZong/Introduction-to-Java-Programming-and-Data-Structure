package Chapter3.Example;

import java.util.Scanner;

public class ExampleP103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("i = ");
        int i = input.nextInt();
        System.out.print("k = ");
        int k = input.nextInt();
        System.out.print("j = ");
        int j = input.nextInt();

        if (i > k) {
            if (j > k)
                System.out.println("i and j are greater than k");
        }
        else
            System.out.println("i is less than or equal to k");

        input.close();
    }
}
