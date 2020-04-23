package Chapter19.Example;

import java.util.ArrayList;

public class ExampleP776 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("White");
        String s = list1.get(0);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(5.5);
        list2.add(3.0);
        Double doubleObject = list2.get(0);
        double d = list2.get(1);

        System.out.println(s);
        System.out.println(d);
    }
}
