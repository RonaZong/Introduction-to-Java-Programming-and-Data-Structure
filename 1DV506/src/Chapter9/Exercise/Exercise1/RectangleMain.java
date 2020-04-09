package Chapter9.Exercise.Exercise1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(4, 40);
        Rectangle b = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle a\nWidth: " + a.getWidth() +
                "\nHeight: " + a.getHeight() +
                "\nArea: " + a.getArea() +
                "\nPerimeter: " + a.getPerimeter());

        System.out.println("\nRectangle b\nWidth: " + b.getWidth() +
                "\nHeight: " + b.getHeight() +
                "\nArea: " + b.getArea() +
                "\nPerimeter: " + b.getPerimeter());
    }
}
