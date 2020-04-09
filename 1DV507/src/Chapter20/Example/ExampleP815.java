package Chapter20.Example;

import java.util.*;

public class ExampleP815 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(list1, new Random(20));
        Collections.shuffle(list2, new Random(20));
        System.out.println(list1);
        System.out.println(list2);

        List<String> list3 = Arrays.asList("white", "black");
        Collections.copy(list1, list3);
        System.out.println(list1);

        Collections.fill(list2, "black");
        System.out.println(list2);

        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1, Comparator.comparing(String::length)));

        Collection<String> collection1 = Arrays.asList("red", "cyan");
        Collection<String> collection2 = Arrays.asList("red", "blue");
        Collection<String> collection3 = Arrays.asList("pink", "tan");
        System.out.println(Collections.disjoint(collection1, collection2));
        System.out.println(Collections.disjoint(collection1, collection3));

        List<GregorianCalendar> list4 = Collections.nCopies(5, new GregorianCalendar(2005, 0, 1));
        System.out.println(list4);



    }
}
