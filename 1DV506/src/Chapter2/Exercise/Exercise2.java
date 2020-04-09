package Chapter2.Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double length = input.nextDouble();
        double height = input.nextDouble();

        double area = Math.sqrt(3) / 4.0 * Math.pow(length, 2);
        double volume = area * height;

        System.out.println("The area is " + area + "\nThe volume of the Triangular prism is " + volume);

        input.close();
    }
}