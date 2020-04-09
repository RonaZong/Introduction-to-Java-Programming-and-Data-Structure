package Chapter7.Example;

public class ExampleP273_4 {
    public static void main(String[] args) {
        double[] myList = new double[5];
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println(total);
    }
}
