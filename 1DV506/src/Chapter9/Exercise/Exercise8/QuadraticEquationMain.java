package Chapter9.Exercise.Exercise8;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getDiscriminant() > 0)
            System.out.print("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
        else if (equation.getDiscriminant() == 0)
            System.out.println("The equation has one root " + equation.getRoot1());
        else
            System.out.println("The equation has no real roots");

        input.close();
    }
}
