package Chapter7.Example;

import java.util.Arrays;

public class ExampleP295_2 {
    public static void main(String[] args) {

        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " + Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " + Arrays.binarySearch(list, 12));

        char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " + Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index is " + Arrays.binarySearch(chars, 't'));
    }
}
