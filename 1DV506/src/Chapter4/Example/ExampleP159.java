package Chapter4.Example;

import java.util.Scanner;

public class ExampleP159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String intString = input.nextLine();
        int intValue = Integer.parseInt(intString);

        String doubleString = input.nextLine();
        double doubleValue = Double.parseDouble(doubleString);

        System.out.println(intString + doubleString);

        input.close();
    }
}
