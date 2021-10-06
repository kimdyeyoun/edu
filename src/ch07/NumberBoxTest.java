package ch07;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox bn1 = new NumberBox(1);
        NumberBox bn2 = new NumberBox(1);

        System.out.println(bn1 == bn2);
        System.out.println(bn1.equals(bn2));
        System.out.println(bn1.getVal());
        System.out.println(bn2.getVal());

        System.out.println(bn1.getVal());
        System.out.println(bn1);
        System.out.println(bn2.getVal());
        System.out.println(bn1);

        String str = new String("abc");
        System.out.println(str);
        System.out.println(str.toString());

    }
}
