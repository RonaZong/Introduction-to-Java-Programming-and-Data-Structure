package Chapter1.Exercise;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("\t\t\u03c0 = 3.14159\nperimeter = 2 * radius * \u03c0\narea = radius * raius * \u03c0\n");

        // Declare
        double radius = 6.5;
        double perimeter = 2 * radius * 3.14159;
        double area = radius * radius * 3.14159;

        System.out.println("The perimeter fot the circle of radius " + radius + " is " + perimeter);
        System.out.println("The area fot the circle of radius " + radius + " is " + area);

    }
}
