package Chapter9.Exercise.Exercise4;

import java.util.Random;

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch a = new StopWatch();

        Random random = new Random();
        int[] list = new int[100000];

        for (int i = 0; i < 100000; i++) {
            list[i] = random.nextInt(100000);
        }

        for (int k = 0; k < list.length; k++) {
            System.out.print(list[k] + " ");
            if ((k + 1) % 1000 == 0)
                System.out.println();
        }
        System.out.println();

        a.start();
        reverse(list);
        a.stop();

        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
            if ((j + 1) % 1000 == 0)
                System.out.println();
        }
        System.out.println("\n" + a.getElapsedTime() + " milliseconds");

    }

    public static void reverse(int[] stack) {
        for (int n = 0; n < stack.length - 1; n++) {
            int currentMax = stack[n];
            int currentMaxIndex = n;

            for (int k = n + 1; k < stack.length; k++) {
                if (currentMax < stack[k]) {
                    currentMax = stack[k];
                    currentMaxIndex = k;
                }
            }

            if (currentMaxIndex != n) {
                stack[currentMaxIndex] = stack[n];
                stack[n] = currentMax;
            }
        }
    }
}
