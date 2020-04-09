package Chapter9.Exercise.Exercise6;

public class FanMain {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        Fan a = new Fan();
        a.setSpeed(FAST);
        a.setRadius(10);
        a.setColor("yellow");
        a.setOn(true);
        System.out.println(a.toString());

        Fan b = new Fan();
        b.setSpeed(MEDIUM);
        b.setRadius(5);
        System.out.println(b.toString());

    }
}
