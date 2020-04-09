package Chapter9.Exercise.Exercise9;

import java.util.Scanner;

public class LinearEquationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (!equation.isSolvable())
            System.out.println("The equation has no solution");
        else
            System.out.println("x is " + equation.getX() + " and y is " + equation.getY());

        input.close();
    }
}
