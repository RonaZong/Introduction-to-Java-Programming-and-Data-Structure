package Chapter24.Example.Example1;

public class TestMyArrayList {
    public static void main(String[] args) {
        // Create a list
        MyList<String> list = new MyArraylist<>();

        // Add elements to the list
        list.add("America");
        System.out.println("(1) " + list);

        // Add it to the beginning of the list
        list.add(0, "Canada");
        System.out.println("(2) " + list);

        // Add it to the end of the list
        list.add("Russia");
        System.out.println("(3) " + list);

        list.add("France");
        System.out.println("(4) " + list);

        list.add(2, "Germany");
        System.out.println("(5) " + list);

        list.add(5, "Norway");
        System.out.println("(6) " + list);

        list.remove("Canada");
        System.out.println("(7) " + list);

        list.remove(2);
        System.out.println("(8) " +list);

        list.remove(list.size() - 1);
        System.out.println("(9) " + list + "\n(10) ");

        for (String s : list) {
            System.out.print(s.toUpperCase() + " ");
        }


    }
}
