package Chapter1.Exercise;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("\tarea = width * height"+
                "\nperimeter = 2 * (width + height)\n");

        // Declare
        double width = 5.3;
        double height = 8.6;
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("The area of a rectangle with a width of " + width + " and height of " + height + " is " + area);
        System.out.println("The perimeter of a rectangle with a width of " + width + " and height of " + height + " is " + perimeter);

    }
}
