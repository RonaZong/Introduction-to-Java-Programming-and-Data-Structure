package Chapter20.Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleP814 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "green", "blue");
        Collections.sort(list);
        System.out.println(list);


        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
        System.out.println("(1)Index: " + Collections.binarySearch(list1, 7));
        System.out.println("(2)Index: " + Collections.binarySearch(list1, 9));

        List<String> list2 = Arrays.asList("blue", "green", "red");
        System.out.println("(3)Index: " + Collections.binarySearch(list2, "red"));
        System.out.println("(4)Index: " + Collections.binarySearch(list2, "cyan"));

        Collections.reverse(list2);
        System.out.println(list2);

        Collections.shuffle(list1);
        System.out.println(list1);


    }
}
