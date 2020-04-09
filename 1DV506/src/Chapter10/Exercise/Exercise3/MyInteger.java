package Chapter10.Exercise.Exercise3;

public class MyInteger {
    private int value;

    public MyInteger() {
        this(3);
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return (this.value + 1) % 2 == 0;
    }

    public boolean isPrime() {
        for (int divisor = 2; divisor <= this.value / 2; divisor++) {
            if (this.value % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isOdd(int n) {
        return (n + 1) % 2 == 0;
    }

    static boolean isPrime(int n) {
        for (int divisor = 2; divisor <= n / 2; divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int n) {
        return this.value == n;
    }

//    static boolean isEven(MyInteger myInteger) {
//        boolean b = myInteger % 2 == 0;
//        return b;
//    }
//
//    static boolean isOdd(MyInteger myInteger) {
//        boolean b = (myInteger + 1) % 2 == 0;
//        return b;
//    }
//
//    static boolean isPrime(MyInteger myInteger) {
//        for (int divisor = 2; divisor <= myInteger / 2; divisor++) {
//            if (myInteger % divisor == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
