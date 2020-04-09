package Chapter10.Exercise.Exercise1;

public class TimeMain {
    public static void main(String[] args) {
        Time[] list = new Time[3];
        list[0] = new Time();
        list[1] = new Time(555550000);
        list[2] = new Time(5, 23, 55);

        System.out.println(list[0].getHour() + ":" + list[0].getMinute() + ":" + list[0].getSecond());
        System.out.println(list[1].getHour() + ":" + list[1].getMinute() + ":" + list[1].getSecond());
        System.out.println(list[2].getHour() + ":" + list[2].getMinute() + ":" + list[2].getSecond());
    }
}
