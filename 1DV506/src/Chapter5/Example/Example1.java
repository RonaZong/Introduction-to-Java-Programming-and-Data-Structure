package Chapter5.Example;

public class Example1 {
    public static void main(String[] args) {
        // Loop
        int count = 0;
        while (count < 10) {
            System.out.println("Welcome to Java!");
            count++;
        }
    }

    public static void main(int[] args) {
        // do-while Loop
        int count = 0;
        do {
            System.out.println("Welcome to Java!");
            count++;
        } while (count < 10);
    }

    public static void main(long[] args) {
        // for Loop
        int count;
        for (count = 0; count < 10; count++) {
            System.out.println("Welcome to Java!");
        }
    }
}
