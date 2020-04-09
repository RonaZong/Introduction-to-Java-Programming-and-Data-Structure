package Chapter6.Exercise;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.printf("%-15s %n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("_____________________________________________");

        for (int miles = 1; miles <= 10; miles++) {
            System.out.println(miles + "            " + mileToKilometer(miles) + "              |       ");
        }

        for (int kilometers = 25; kilometers <= 65; kilometers += 5) {
            System.out.println(kilometers + "       " + Math.round(kilometerToMile(kilometers) * 1000) / 1000);
        }

    }

    public static double mileToKilometer(double mile) {
        mile = (double)Math.round(mile * 1.6 * 1000) / 1000;
        return mile;
    }

    public static double kilometerToMile(double kilometer) {
        kilometer /= 1.6;
        return kilometer;
    }
}
