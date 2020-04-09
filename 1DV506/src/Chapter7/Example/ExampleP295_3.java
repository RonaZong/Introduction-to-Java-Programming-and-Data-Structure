package Chapter7.Example;

import java.util.Arrays;

public class ExampleP295_3 {
    public static void main(String[] args) {
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(Arrays.equals(list1, list2));
        System.out.println(Arrays.equals(list2, list3));
    }
}
