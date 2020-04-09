package Chapter7.Example;

import java.util.Arrays;

public class ExampleP295_4 {
    public static void main(String[] args) {
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};
        Arrays.fill(list1, 5);
        Arrays.fill(list2, 1, 5, 8);
    }
}
