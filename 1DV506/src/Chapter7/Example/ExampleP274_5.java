package Chapter7.Example;

public class ExampleP274_5 {
    public static void main(String[] args) {
        double[] myList = new double[5];
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max)
                max = myList[i];
        }
        System.out.println(max);
    }
}
