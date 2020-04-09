package Chapter11.Exercise.Exercise1;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("yellow", true,3, 4, 5);

        System.out.println("A triangle " + triangle.toString());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("The triangle is " + triangle.isFilled());
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
    }
}
