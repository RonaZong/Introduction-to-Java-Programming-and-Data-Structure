package Chapter1.Exercise;

public class Exercise11 {
    public static void main(String[] args) {
        String text = "Number of birth ";
        int birth = 365 * 24 * 60 * 60 / 7;
        String name = "Number of death ";
        int death = 365 * 24 * 60 * 60 / 13;
        String title = "Number of new immigrant ";
        int immigrant = 365 * 24 * 60 * 60 / 45;

        System.out.println(text + birth);
        System.out.println(name + death);
        System.out.println(title + immigrant);

    }
}
