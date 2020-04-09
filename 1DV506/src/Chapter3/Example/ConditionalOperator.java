package Chapter3.Example;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y;

        // ? ... : ... = boolean-expression ? expression1 : expression2
        System.out.println(y = (x > 0) ? 1 : -1);

        input.close();
    }
}
