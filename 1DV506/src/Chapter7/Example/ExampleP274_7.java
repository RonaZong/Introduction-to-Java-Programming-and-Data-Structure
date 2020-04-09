package Chapter7.Example;

public class ExampleP274_7 {
    //?
    public static void main(String[] args) {
        double[] myList = new double[3];
        for (int i = 0; i < myList.length - 1; i++) {
            int j = (int)(Math.random() * myList.length);

            double temp = myList[i];
            myList[i] = myList [j];
            myList[j] = temp;
        }
        System.out.println();
    }
}
