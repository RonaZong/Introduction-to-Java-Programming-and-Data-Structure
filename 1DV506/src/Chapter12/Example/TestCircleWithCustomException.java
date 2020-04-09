package Chapter12.Example;

public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
    }
}

class CircleWithCustomException {

    private double radius;

    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRaiuds) throws InvalidRadiusException {
        if (newRaiuds >= 0)
            radius = newRaiuds;
        else
            throw new InvalidRadiusException(newRaiuds);
    }

    public static int getNumberOfObjects() {
        return getNumberOfObjects();
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }
}
