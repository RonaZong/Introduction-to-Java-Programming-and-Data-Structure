package Chapter7.Example;

public class ExampleP274_8 {
    public static void main(String[] args) {
        double[] myList = {8,2,3,4};
        double temp = myList[0];

        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }
        myList[myList.length - 1] = temp;
        System.out.println(temp);
    }
}
