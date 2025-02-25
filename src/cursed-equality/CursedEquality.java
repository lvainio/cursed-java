public class CursedEquality {
    @SuppressWarnings("removal")
    public static void main(String... args) {
        Integer i1 = 3;
        Integer i2 = 3;
        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);

        System.out.println("(i1 == i2) = " + (i1 == i2));
        System.out.println("(i3 == i4) = " + (i3 == i4));

        String s1 = "HI";
        String s2 = "HI";
        String s3 = new String("HI");
        String s4 = new String("HI");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        System.out.println("(s1 == s2) = " + (s1 == s2));
        System.out.println("(s3 == s4) = " + (s3 == s4));

        Character c1 = 'A';
        Character c2 = 'A';
        Character c3 = '\u2665';
        Character c4 = '\u2665';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        System.out.println("(c1 == c2) = " + (c1 == c2));
        System.out.println("(c3 == c4) = " + (c3 == c4));

        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(true);
        Boolean b3 = new Boolean(true);
        Boolean b4 = new Boolean(true);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        System.out.println("(b1 == b2) = " + (b1 == b2));
        System.out.println("(b3 == b4) = " + (b3 == b4));

        int a = 1;
        int b = 1;
        boolean c = true;
        System.out.println(a == b == c);

    }
}
