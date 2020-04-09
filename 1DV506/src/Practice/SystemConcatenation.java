package Practice;

public class SystemConcatenation {
    public static void main(String[] args) {
        System.out.println("This sentence gives a string that, according to me, is too long to fit on a single line.");
        System.out.println("This sentence gives a string that, "+
                "according to me, is too long to fit "+
                "on a single line.");

        System.out.println("        ");

        System.out.println("string"+
                "+string"+
                "=new string");
        System.out.println("number"+
                "+number"+
                "=new number");

        System.out.println("For example: "+
                "Number of students is "+
                144);
    }
}
