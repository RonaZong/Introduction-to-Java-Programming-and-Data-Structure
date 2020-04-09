package Chapter10.Exercise.Exercise3;

public class MyIntegerMain {
    public static void main(String[] args) {
        MyInteger a = new MyInteger();
        MyInteger b = new MyInteger(2);

        System.out.println(a.getValue() + "\n" + a.isEven() + "\n" + a.isOdd() + "\n" + a.isPrime());
        System.out.println(b.getValue() + "\n" + b.isEven() + "\n" + b.isOdd() + "\n" + b.isPrime());


        System.out.println(a.equals(b));

        char[] list = {23, 45, 67, 48};
        System.out.println(parseInt(list));

        String str = "1234";
        System.out.println(parseInt(str));
    }

    public static int parseInt(char[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i ++) {
            result  = result * 10 + (n[i] - 48);
        }
        return result;
    }

    public static int parseInt(String str) {
        int result = Integer.parseInt(str);
        return result;
    }
}
