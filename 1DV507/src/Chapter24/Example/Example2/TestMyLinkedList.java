//package Chapter24.Example.Example2;
//
//public class TestMyLinkedList {
//    /** Main method */
//    public static void main(String[] args) {
//        // Create a list for strings
//        MyLinkedList<String> list = new MyLinkedList<>();
//
//        // Add elements to the list
//        list.add("America");
//        System.out.println("(1) " +list);
//
//        list.add(0, "Canada");
//        System.out.println("(2) " + list);
//
//        list.add("Russia");
//        System.out.println("(3) " + list);
//
//        list.add("France");
//        System.out.println("(4) " + list);
//
//        list.add(2, "Germany");
//        System.out.println("(5) " + list);
//
//        list.add(5, "Norway");
//        System.out.println("(6) " + list);
//
//        list.add(0, "Poland");
//        System.out.println("(7) " + list);
//
//        list.remove(0);
//        System.out.println("(8) " + list);
//
//        list.remove(2);
//        System.out.println("(9) " + list);
//
//        list.remove(list.size() - 1);
//        System.out.print("(10) " + list + "\n(11) ");
//
//        for (String s : list) {
//            System.out.print(s.toUpperCase() + " ");
//        }
//
//        list.clear();
//        System.out.println("\nAfter clearing the list, the list size is " + list.size());
//    }
//}
