package Chapter10.Exercise.Exercise5;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a positive integer: ");
        int integer = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers(integer);

        while (integer != 1) {
            for (int i = 2; i <= integer; i++) {
                if (integer % i == 0 && isPrime(i)) {
                    stack.push(i);
                    integer = integer / i;
                }
            }
        }

//        while (!stack.empty()) {
//            System.out.print(stack.pop() + " ");
//        }

        int[] list = new int[stack.getSize()];
        for (int k = 0; k < list.length; k++) {
            list[k] = stack.pop();
        }

        reverse(list);

        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }

        input.close();
    }

    public static boolean isPrime(int n) {
        for (int divisor = 2; divisor <= n / 2; divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
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
