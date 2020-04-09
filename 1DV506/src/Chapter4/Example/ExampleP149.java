package Chapter4.Example;

public class ExampleP149 {
    public static void main(String[] args) {
        // '0~9' = 48~57 = \u0030 ~ \u0039
        // 'A~Z' = 65~90 = \u0041 ~ \u005A
        // 'a~z' = 97~122 = \u0061 ~ \u007A

        char letter = '\u0041';
        System.out.println(letter);
        System.out.println(++letter);

        char ch = (char)0XAB0041;
        System.out.println(ch);

        char sh = (char)65.25;
        System.out.println(sh);

        int i = (int)'A';
        System.out.println(i);

        byte b = 'a';
        System.out.println(b);

        byte c = (byte)'\uFFF4';
        System.out.println(c);

        int d = '2' + '3';
        System.out.println(d);

        int e = 2 + 'a';
        System.out.println((char)e);

        System.out.println("He said \"Java is fun\"");
        System.out.println("\\t is a tab character");

    }
}
