package Chapter12.Example;

public class InvalidRadiusException extends Exception { //InvalidRadiusException

    private double radius;

    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
