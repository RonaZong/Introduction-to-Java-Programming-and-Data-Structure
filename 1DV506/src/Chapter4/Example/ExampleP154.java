package Chapter4.Example;

public class ExampleP154 {
    public static void main(String[] args) {
        String message = "Welcome " + "to " + "Java";
        message += " and Java is fun";
        System.out.println(message);

        String s = "Chapter" + 2;
        String s1 = "\nSupplement" + "B";
        String s2 = s.concat(s1); // s2 = s+s1
        System.out.println(s2);

        System.out.println("\t Good Night \n".trim());

    }
}
