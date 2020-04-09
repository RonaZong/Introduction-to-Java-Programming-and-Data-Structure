package Chapter13.Exercise.Exercise1;

import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("Is it filled: ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(color, filled, side1, side2, side3);

        triangle.setColor(color);

        triangle.setFilled(filled);


        System.out.println(triangle.toString());
        input.close();
        scanner.close();
    }
}
