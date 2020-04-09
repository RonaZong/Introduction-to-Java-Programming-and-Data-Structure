package Chapter7.Example;

import java.util.Arrays;

public class ExampleP295_1 {
    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        Arrays.parallelSort(numbers);

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars, 1, 3);
        Arrays.parallelSort(chars, 1, 3);

    }
}
