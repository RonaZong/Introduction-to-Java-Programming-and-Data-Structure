package Chapter9.Exercise.Exercise8;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        else
            return (-this.b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        else
            return (-this.b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
