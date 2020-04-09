package Chapter9.Exercise.Exercise7;

public class RegularPolygonMain {
    public static void main(String[] args) {
        RegularPolygon a = new RegularPolygon();
        RegularPolygon b = new RegularPolygon(6, 4);
        RegularPolygon c = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Perimeter: " + a.getPerimeter() + "\nArea: " + a.getArea());
        System.out.println("Perimeter: " + b.getPerimeter() + "\nArea: " + b.getArea());
        System.out.println("Perimeter: " + c.getPerimeter() + "\nArea: " + c.getArea());

    }
}
