package Chapter9.Exercise.Exercise3;

import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            Date date = new Date((long) (10000 * Math.pow(10, i)));
            System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
            System.out.println(date.toString());
        }
    }
}
