package Chapter10.Exercise.Exercise4;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint other) {
        double d = Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
        return d;
    }

    public double distance(double x, double y) {
        double d = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        return d;
    }

    static double distance(MyPoint a, MyPoint b) {
        double d = Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
        return d;
    }

}
