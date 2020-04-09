package Chapter24.Example;

import Chapter24.Example.Example1.MyArraylist;

public class ExampleP950 {
    public static void main(String[] args) {
        MyArraylist<Double> list = new MyArraylist<>();
        list.add(1.5);
        list.trimToSize();
        list.add(3.4);
        list.add(7.4);
        list.add(17.4);
        System.out.println(list);
    }
}
