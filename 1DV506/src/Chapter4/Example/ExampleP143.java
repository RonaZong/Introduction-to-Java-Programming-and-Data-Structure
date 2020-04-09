package Chapter4.Example;

public class ExampleP143 {
    public static void main(String[] args) {
        System.out.println(Math.toDegrees(Math.PI / 2));
        System.out.println(Math.toRadians(30));
        System.out.println(Math.sin(0));
        System.out.println(Math.sin(Math.toRadians(270)));
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println(Math.cos(0));
        System.out.println(Math.cos(Math.PI / 2));
        System.out.println(Math.asin(0.5));
        System.out.println(Math.acos(0.5));
        System.out.println(Math.atan(1));
        System.out.println(Math.exp(3.5));
        System.out.println(Math.log(3.5));
        System.out.println(Math.log10(3.5));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(4));

        System.out.println(Math.ceil(2.25));
        System.out.println(Math.ceil(2.75));
        System.out.println(Math.floor(2.25));
        System.out.println(Math.floor(2.75));
        System.out.println(Math.rint(2.25));
        System.out.println(Math.rint(2.75));
        System.out.println(Math.round(2.25));
        System.out.println(Math.round(2.25f));
        System.out.println(Math.round(2.75));
        System.out.println(Math.round(2.75f));

        System.out.println(Math.abs(-2.75));
        System.out.println(Math.max(2.75, 5.25));
        System.out.println(Math.min(2.75, 5.25));
        System.out.println(Math.max(Math.max(2.75, 5.25), Math.min(3.75, 4.25)));

    }
}
